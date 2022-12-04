package io.github.stscoundrel.oldicelandicdictionary;

import com.google.gson.annotations.SerializedName;

public class DictionaryEntry {
    @SerializedName("a")
    public String headword;

    @SerializedName("b")
    public String[] definitions;    
}
