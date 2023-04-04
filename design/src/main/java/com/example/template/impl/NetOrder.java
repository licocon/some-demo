package com.example.template.impl;

import com.example.template.OrderProcessTemplate;

/**
 * @author licocon
 * @since 2022/12/29 20:25
 */
public class NetOrder extends OrderProcessTemplate {

    @Override
    protected void doSelect() {
        System.out.println("选择商品");
    }

    @Override
    protected void doPayment() {
        System.out.println("支付1999");

    }

    @Override
    protected void doReceipt() {
        System.out.println("开具发票");
    }

    @Override
    protected void doDelivery() {
        System.out.println("顺丰发货");
    }
}
