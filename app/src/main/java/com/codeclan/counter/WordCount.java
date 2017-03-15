package com.codeclan.counter;

import java.util.HashMap;
import java.util.Map;


public class WordCount {



    public static Map wordCount(String str) {
        String[] splitStr = str.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : splitStr) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        return  wordCount;
    }

    public static String output(Map<String, Integer> map) {
        String result = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            result = "Word = " + entry.getKey() + ", Count = " + entry.getValue();
        }
        return result;
    }
}
