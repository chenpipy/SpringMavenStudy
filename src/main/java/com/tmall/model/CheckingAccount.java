package com.tmall.model;

import com.tmall.constant.InsufficientFundsException;

/**
 * 银行账户类
 *
 * @author chenjun on 2018/11/14
 */
public class CheckingAccount {

    /**
     * 账户中的余额
     */
    private double balance;

    public double getBalance() {
        return balance;
    }

    /**
     * 构造方法
     * @param amount 初始化余额
     */
    public CheckingAccount(double amount){
        this.balance=amount;
    }

    /**
     * 存钱
     * @param amount 存入的金额
     */
    public void dposit(double amount){
        this.balance+=amount;
    }

    /**
     * 取钱
     * @param amount 取钱的金额
     * @throws InsufficientFundsException
     */
    public void withdraw(double amount) throws InsufficientFundsException{
        if (balance>=amount){
            this.balance-=amount;
        }else{
            double needs=amount-balance;
            throw new InsufficientFundsException(needs);
        }
    }
}

