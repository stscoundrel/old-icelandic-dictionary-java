package io.github.stscoundrel.oldicelandic;

import com.google.gson.annotations.SerializedName;

public class DictionaryEntry {
    @SerializedName("a")
    public String headword;

    @SerializedName("b")
    public String[] definitions;    
}
