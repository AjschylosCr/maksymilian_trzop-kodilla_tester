package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {
    @Test
    public void testEnglishWords() {
        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "stack"));
        //when
        List<EnglishWord> result = dictionary.findEnglishWords("gra");
        //then
        assertEquals(3, dictionary.size());
    }
}