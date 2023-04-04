package com.example.strategy;

/**
 * @author licocon
 * @since 2022/12/29 20:46
 */
public class SortContext {
    private final SortStrategy sortStrategy;

    public SortContext(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(int[] arr) {
        sortStrategy.sort(arr);
    }
}
