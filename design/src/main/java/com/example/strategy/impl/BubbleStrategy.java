package com.example.strategy.impl;

import com.example.strategy.SortStrategy;

/**
 * @author licocon
 * @since 2022/12/29 20:37
 */
public class BubbleStrategy implements SortStrategy {
    @Override
    public void sort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
