package com.GuilhermePaivaAlves.leetcode.algoritmos.ex09;

public class PalindromeNumber {
    public boolean isPalindrome(int x){
        String numero = String.valueOf(x);
        String palindromo = new StringBuilder(numero).reverse().toString();
        if(palindromo.equals(String.valueOf(x))){
            return true;
        }else {
            return false;
        }
    }

    static void main(String[] args) {
        PalindromeNumber solution = new PalindromeNumber();
        boolean entrada1 = solution.isPalindrome(121);
        boolean entrada2 = solution.isPalindrome(-121);
        boolean entrada3 = solution.isPalindrome(10);

        System.out.printf("""
                Saída 1: %b
                Saída 2: %b
                Saída 3: %b
                """, entrada1,entrada2,entrada3);
    }
}
