package com.example.template;

/**
 * @author licocon
 * @since 2022/12/29 20:22
 */
public abstract class OrderProcessTemplate {
    /**
     * 处理订单
     */
    public void processOrder() {
        //选择商品
        doSelect();


        doPayment();
        doReceipt();
        doDelivery();
    }

    /**
     * 选择商品
     */
    protected abstract void doSelect();

    /**
     * 支付
     */
    protected abstract void doPayment();

    /**
     * 发票
     */
    protected abstract void doReceipt();

    /**
     * 发货
     */
    protected abstract void doDelivery();

}
