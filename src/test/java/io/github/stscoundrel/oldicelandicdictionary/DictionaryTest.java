package io.github.stscoundrel.oldicelandicdictionary;

import junit.framework.TestCase;

public class DictionaryTest
        extends TestCase {
    public void testDefaultDictionaryHasExpectedAmountOfEntries() {
        Dictionary dictionary = new Dictionary();
        DictionaryEntry[] result = dictionary.getDictionary();

        assertEquals(29951, result.length);
    }

    public void testMarkupDictionaryHasExpectedAmountOfEntries() {
        Dictionary dictionary = new Dictionary();
        DictionaryEntry[] result = dictionary.getMarkupDictionary();

        assertEquals(29951, result.length);
    }

    public void testDictionaryHeadwordsMatch() {
        Dictionary dictionary = new Dictionary();
        DictionaryEntry[] noMarkupResult = dictionary.getDictionary();
        DictionaryEntry[] markupResult = dictionary.getMarkupDictionary();

        for (int i = 0; i < 29951; i++) {
            assertEquals(noMarkupResult[i].headword, markupResult[i].headword);
        }
    }

    public void testDictionaryHasExpectedContent() {
        Dictionary dictionary = new Dictionary();
        DictionaryEntry[] result = dictionary.getDictionary();

        assertEquals("a", result[0].headword);
        assertEquals("a negative suffix to verbs, not;", result[0].definitions[0]);
        assertEquals("era útmakligt, at it is not unmeet that.", result[0].definitions[1]);

        assertEquals("afbindi", result[14].headword);
        assertEquals("n. constipation.", result[14].definitions[0]);

        assertEquals("andstreymr", result[1000].headword);
        assertEquals(
                "a. strongly adverse (andstreym ørlög); Sighvatr var heldr ~ um eptirmálin, hard to come to terms with.",
                result[1000].definitions[0]);

        assertEquals("undanhald", result[25000].headword);
        assertEquals("n. flight.", result[25000].definitions[0]);
    }

    public void testMarkupDictionaryHasExpectedContent() {
        Dictionary dictionary = new Dictionary();
        DictionaryEntry[] result = dictionary.getMarkupDictionary();

        assertEquals("a", result[0].headword);
        assertEquals("a negative suffix to verbs, <i>not</i>;", result[0].definitions[0]);
        assertEquals("era útmakligt, <i>at it is not unmeet that</i>.", result[0].definitions[1]);

        assertEquals("afbindi", result[14].headword);
        assertEquals("n. <i>constipation</i>.", result[14].definitions[0]);

        assertEquals("andstreymr", result[1000].headword);
        assertEquals(
                "a. <i>strongly adverse</i> (andstreym ørlög); Sighvatr var heldr ~ um eptirmálin, <i>hard to come to terms with</i>.",
                result[1000].definitions[0]);

        assertEquals("undanhald", result[25000].headword);
        assertEquals("n. <i>flight</i>.", result[25000].definitions[0]);
    }
}