package com.codeclan.counter;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;


public class WordCountTest {
    @Test
    public void canCountTest(){
        String text = "I am a horse a horse is me";
        Map<String, Integer>map = new HashMap<String, Integer>();
         map =  WordCount.wordCount(text);

    }
}