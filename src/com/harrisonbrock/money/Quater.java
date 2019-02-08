package com.harrisonbrock.money;

public class Quater implements Coin {
    private double totalAmount;
    private int amount;
    private final double VALUE = 0.25;

    public Quater() {
        amount = 1;
        this.totalAmount = amount * VALUE;
    }

    public Quater(int amount) {
        this.amount = amount;
        this.totalAmount= amount * VALUE;
    }

    @Override
    public int amountInserted() {
        return amount;
    }

    @Override
    public String getName() {
        return "Quarter";
    }

    @Override
    public double getAmount() {
        return totalAmount;
    }
}
