package com.example.strategy.impl;

import com.example.strategy.SortStrategy;

import java.util.Arrays;

/**
 * @author licocon
 * @since 2022/12/29 20:38
 */
public class QuickStrategy implements SortStrategy {
    @Override
    public void sort(int[] arr) {
        Arrays.sort(arr);
    }
}
