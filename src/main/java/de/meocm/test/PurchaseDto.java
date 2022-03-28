package de.meocm.test;

import java.math.BigDecimal;

public class PurchaseDto {

    private int amount;
    private BigDecimal payment;

    public PurchaseDto(int amount) {
        this.amount = amount;
    }

    public PurchaseDto(int amount, BigDecimal payment) {
        this.amount = amount;
        this.payment = payment;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }
}
