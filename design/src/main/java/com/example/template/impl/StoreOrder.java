package com.example.template.impl;

import com.example.template.OrderProcessTemplate;

/**
 * @author licocon
 * @since 2022/12/29 20:26
 */
public class StoreOrder extends OrderProcessTemplate {
    @Override
    protected void doSelect() {
        System.out.println("线下选择商品");
    }

    @Override
    protected void doPayment() {
        System.out.println("线下支付200");
    }

    @Override
    protected void doReceipt() {
        System.out.println("线下开小票");
    }

    @Override
    protected void doDelivery() {
        System.out.println("用户带走了");
    }
}
