package com.example.template;

import com.example.template.impl.NetOrder;

/**
 * @author licocon
 * @since 2022/12/29 20:24
 */
public class OrderProcessTemplateTest {
    public static void main(String[] args) {
        OrderProcessTemplate orderProcessTemplate = new NetOrder();
        orderProcessTemplate.processOrder();
    }
}
