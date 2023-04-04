package com.example.strategy;

import com.example.strategy.impl.BubbleStrategy;
import com.example.strategy.impl.QuickStrategy;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author licocon
 * @since 2022/12/29 20:42
 */
public class SortStrategyTest {
    public static void main(String[] args) {
        int[] arr = {111, 22321,43223, -1, 5, 6, 7, 8, 9, 10};
        SortStrategy sortStrategy = new BubbleStrategy();
        sortStrategy.sort(arr);
        System.out.println(Arrays.toString(arr));
        arr = new int[]{111, 22321, 43223, -1, 5, 6, 7, 8, 9, 10};
        sortStrategy = new QuickStrategy();
        sortStrategy.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
