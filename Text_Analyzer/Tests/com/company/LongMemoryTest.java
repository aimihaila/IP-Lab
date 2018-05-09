package com.company;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class LongMemoryTest {
    LongMemory test=new LongMemory();
    @Test //if the input is null or the concept_key is not in the DB
    public void testSearchNotFound() {
        String word=null;
        Concept result;
        result=test.search(word);
        assertFalse(result.getFoundInDB());
    }

    @Test //if an existing concept_key is found
    public void testSearchFound() {
        String word="labrador";
        Concept result;
        result=test.search(word);
        assertTrue(result.getFoundInDB());
    }

    @Test
    public void testAddNullParameters() {
        Concept result;
        String conceptKey="", conceptName="", conceptClassName="", conceptURL="";
        Set<String> conceptClassKeywords=new TreeSet<>();
        conceptClassKeywords.add("");
        test.add(conceptKey, conceptName, conceptClassName, conceptClassKeywords, conceptURL);
        result=test.search(conceptKey);
        assertFalse(result.getFoundInDB());
    }
}