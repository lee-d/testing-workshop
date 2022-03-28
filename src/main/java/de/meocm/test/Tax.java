package de.meocm.test;

import java.math.BigDecimal;

public class Tax {

    private long id;
    private BigDecimal amountInPercent;

    public Tax(long id, BigDecimal amountInPercent) {
        this.id = id;
        this.amountInPercent = amountInPercent;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getAmountInPercent() {
        return amountInPercent;
    }

    public void setAmountInPercent(BigDecimal amountInPercent) {
        this.amountInPercent = amountInPercent;
    }
}
