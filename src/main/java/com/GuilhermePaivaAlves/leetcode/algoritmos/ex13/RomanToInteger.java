package com.GuilhermePaivaAlves.leetcode.algoritmos.ex13;

public class RomanToInteger {

    public int romanToInt(String s){
        int resultado = 0;
        char[] romanos = s.trim().toCharArray();

        char[] numerosRomanos = {'M','D','C','L','X','V','I'};
        int[] numerosInteiros = {1000,500,100,50,10,5,1};

        for (int i = 0; i < romanos.length; i++) {
            int valorAtual = valorDoSimbolo(romanos[i],numerosRomanos,numerosInteiros);

            if (i+1 < romanos.length){
                int valorProximo = valorDoSimbolo(romanos[i+1],numerosRomanos,numerosInteiros);

                if (valorAtual < valorProximo){
                    resultado -= valorAtual;
                }else {
                    resultado += valorAtual;
                }
            }else {
                resultado += valorAtual;
            }

        }

        return resultado;

    }

    private int valorDoSimbolo(char simbolo, char[] numerosRomanos, int[] numerosInteiros) {
        for (int j = 0; j < numerosRomanos.length; j++) {
            if (simbolo == numerosRomanos[j]) {
                return numerosInteiros[j];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        RomanToInteger sugestion = new RomanToInteger();

        System.out.println(sugestion.romanToInt("LVIII"));
    }
}
