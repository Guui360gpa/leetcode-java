package com.GuilhermePaivaAlves.leetcode.algoritmos.ex14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Optional;

public class LongestCommonPrefix {

    private String candidata = "";

    public String longestCommonPrefix(String[] strs){
        if (strs == null || strs.length == 0){
            return "";
        }
        Optional<String> candidataEncontrada = Arrays.stream(strs).min(Comparator.comparing(s -> s.length()));
        candidata =  candidataEncontrada.orElse("");

        boolean encontrouPrefixo = false;

        while(!encontrouPrefixo && !candidata.isEmpty()){
            encontrouPrefixo = true;

            for (String str : strs) {
                if (!comecaCom(str)){
                    candidata = candidata.substring(0,candidata.length() - 1);
                    encontrouPrefixo = false;
                    break;
                }
            }

        }
        return candidata;
    }

    private boolean comecaCom(String str){
        return str.startsWith(candidata);

    }

    public static void main(String[] args) {
        LongestCommonPrefix commonPrefix = new LongestCommonPrefix();
        String[] strings = {"dog", "racecar", "car"};
        System.out.println(commonPrefix.longestCommonPrefix(strings));
    }
}
