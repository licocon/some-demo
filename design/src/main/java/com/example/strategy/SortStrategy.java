package com.example.strategy;

/**
 * 排序策略
 *
 * @author licocon
 * @since 2022/12/29 20:36
 */
public interface SortStrategy {

    /**
     * 排序
     *
     * @param arr 数组
     */
    void sort(int[] arr);
}
