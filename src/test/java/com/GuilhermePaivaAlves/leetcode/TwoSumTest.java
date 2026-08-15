package com.GuilhermePaivaAlves.leetcode;

import com.GuilhermePaivaAlves.leetcode.algoritmos.ex01.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TwoSumTest {

    private final TwoSum solucao = new TwoSum();

    @Test
    void deveEncontrarOsIndicesQueSomamOTarget() {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;

        int[] resultado = solucao.twoSum(nums, target);

        assertArrayEquals(new int[] { 0, 1 }, resultado);
    }

    @Test
    void deveFuncionarComNumerosRepetidos() {
        int[] nums = { 3, 3 };
        int target = 6;

        int[] resultado = solucao.twoSum(nums, target);

        assertArrayEquals(new int[] { 0, 1 }, resultado);
    }

    @Test
    void deveLancarExcecaoQuandoNaoHaSolucao() {
        int[] nums = { 1, 2, 3 };
        int target = 100;

        assertThrows(IllegalArgumentException.class, () -> solucao.twoSum(nums, target));
    }
}
