package de.meocm.test;

import java.math.BigDecimal;

public class PurchaseResultDto {

    private Product product;
    private BigDecimal change;

    public PurchaseResultDto() {
    }

    public PurchaseResultDto(Product product, BigDecimal change) {
        this.product = product;
        this.change = change;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public BigDecimal getChange() {
        return change;
    }

    public void setChange(BigDecimal change) {
        this.change = change;
    }
}
