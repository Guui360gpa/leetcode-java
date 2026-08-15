package com.GuilhermePaivaAlves.leetcode.algoritmos.ex01;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length ; i++){
//            int complemento = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if(i != j) {
                    if (nums[i] + nums[j] == target) {
                        int[] indice = {i, j};
                        return indice;
                    }
                }
            }

        }
        return new int[] {};
    }

    static void main(String[] args) {
        int[] numeros = {2,5,5,11};

        TwoSum solution = new TwoSum();
        System.out.println(Arrays.toString(solution.twoSum(numeros,10)));
    }
}
