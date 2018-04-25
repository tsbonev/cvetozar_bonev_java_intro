package com.clouway.crm.core;
import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MostCommon {


    /**
     * Counts the times all distinct words appear in a given string
     *
     * @param words the string to sreach through
     * @return a string with the result
     */
    public String wordCount(String words){

        Set<String> wordSet = Arrays.stream(words.split(" ")).collect(Collectors.toSet());

        StringBuilder builder = new StringBuilder();

        int len = 0;

        for (String word: wordSet
             ) {
            builder.append(word);
            builder.append(": ");
            long count = Stream.of(words.split(" ")).filter(c -> c.equals(word)).count();
            builder.append(count);
            if(len < wordSet.size() - 1){
                builder.append(", ");
            }
            len++;
        }

        return builder.toString();
    }

    /**
     * Finds the most common letter in a given string
     *
     * @param words the string to search through
     * @return the most common letter
     */
    public String letterCount(String words){

        words.toLowerCase();

        Set<String> wordSet = Arrays.stream(words.split("")).filter(c -> c != " ").collect(Collectors.toSet());

        String mostCommonLetter = "";

        long largestYet = 0;

        for (String letter: wordSet
                ) {
            long count = Stream.of(words.split("")).filter(c -> c.equals(letter)).count();
            if(count > largestYet){
                largestYet = count;
                mostCommonLetter = letter;
            }
        }

        return mostCommonLetter;

    }

}
