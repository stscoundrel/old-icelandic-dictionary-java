# Old Icelandic Dictionary

Old Icelandic dictionary for Java. From "A Concise Dictionary of Old Icelandic" by Geir Zoëga

The dictionary consists of 29 000+ Old Icelandic words with English translations.

## Install

As Maven dependency.

```xml
<dependency>
  <groupId>io.github.stscoundrel</groupId>
  <artifactId>old-icelandic-dictionary</artifactId>
  <version>0.1.1</version> <!-- Note! Check latest release number -->
</dependency>
```

For alternative install methods, see the [Maven Central Repo](https://search.maven.org/artifact/io.github.stscoundrel/old-icelandic-dictionary)

### Usage

The dictionary comes in two variants:
- Markup version of dictionary has html markup `<i>` and `<b>` to match look of the original book.
- No-markup version has the same content without any additional formatting tags.

```java

import io.github.stscoundrel.oldicelandicdictionary;

Dictionary dictionary = new Dictionary();

// Both dictionaries return entries that consist of headword and definitions list.
DictionaryEntry[] noMarkupResult = dictionary.getDictionary(); // has alias "getNoMarkupDictionary"
DictionaryEntry[] markupResult = dictionary.getMarkupDictionary();

// Headwords wont differ between dictionaries.
System.out.println(noMarkupResult[14].headword);  // afbindi
System.out.println(markupResult[14].headword);    // afbindi

// But definition markup does differ.
System.out.println(noMarkupResult[14].definitions[0]);   // n. constipation.
System.out.println(markupResult[14].definitions[0]);     // n. <i>constipation</i>.

```

Individual words are returned in format of:

```java
{
    String headword;
    String[] definitions;
}
```

### About "A Concise Dictionary of Old Icelandic"

"A Concise Dictionary of Old Icelandic" dictionary was published in 1910 by Geir Zoëga, which leads to there being many public domain versions of the book available. Zoëgas attempt was to made easier-to-approach version of the more full Cleasby - Vigfusson dictionary, specifically for beginners and those interested in Old Icelandic prose writing.
