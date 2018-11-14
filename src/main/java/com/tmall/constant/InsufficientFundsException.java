package com.tmall.constant;

/**
 * 取款是余额不足的异常类
 *
 * @author chenjun on 2018/11/14
 */
public class InsufficientFundsException extends Exception{
    private double amount;
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount 取款时，余额不足的钱
     */
    public InsufficientFundsException (double amount){
        this.amount=amount;
    }
}
