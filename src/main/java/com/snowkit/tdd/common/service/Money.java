package com.snowkit.tdd.common.service;

public class Money {

    protected int amount;

    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Dollar(amount, null);
    }

    public static Money franc(int amount) {
        return new Franc(amount, null);
    }

    abstract public Money times(int multiplier);

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    public String currency() {
        return currency;
    }
}
