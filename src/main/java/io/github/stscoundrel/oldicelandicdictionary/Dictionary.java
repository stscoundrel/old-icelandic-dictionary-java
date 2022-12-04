package io.github.stscoundrel.oldicelandicdictionary;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import com.google.gson.Gson;

public class Dictionary {
    private DictionaryEntry[] entries;
    private DictionaryEntry[] markupEntries;

    enum DictionaryLocation {
        NoMarkup,
        Markup
    }

    private static String getDictionaryPath(DictionaryLocation location) {
        if (location == DictionaryLocation.NoMarkup) {
            return "/no-markup.json";
        }
        return "/markup.json";

    }

    private static DictionaryEntry[] readDictionary(DictionaryLocation location) {
        // Read the JSON file from the resources folder
        InputStream inputStream = Dictionary.class.getResourceAsStream(getDictionaryPath(location));
        Reader reader = new InputStreamReader(inputStream);

        // Create a Gson instance
        Gson gson = new Gson();

        // Parse the JSON and convert it to a Java object
        DictionaryEntry[] result = gson.fromJson(reader, DictionaryEntry[].class);

        return result;
    }

    public DictionaryEntry[] getMarkupDictionary() {
        if (entries == null) {
            entries = readDictionary(DictionaryLocation.Markup);
        }

        return entries;
    }

    public DictionaryEntry[] getNoMarkupDictionary() {
        if (markupEntries == null) {
            markupEntries = readDictionary(DictionaryLocation.NoMarkup);
        }

        return markupEntries;
    }

    public DictionaryEntry[] getDictionary() {
        return getNoMarkupDictionary();
    }
}