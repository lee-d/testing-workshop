package de.meocm.test;

import java.math.BigDecimal;

public class Product {

    private long id;
    private String name;
    private BigDecimal price;
    private boolean hasDiscount;
    private BigDecimal discountInPercent;

    public Product(long id, String name, BigDecimal price, boolean hasDiscount, BigDecimal discountInPercent) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.hasDiscount = hasDiscount;
        this.discountInPercent = discountInPercent;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isHasDiscount() {
        return hasDiscount;
    }

    public void setHasDiscount(boolean hasDiscount) {
        this.hasDiscount = hasDiscount;
    }

    public BigDecimal getDiscountInPercent() {
        return discountInPercent;
    }

    public void setDiscountInPercent(BigDecimal discountInPercent) {
        this.discountInPercent = discountInPercent;
    }

    public BigDecimal calculateTotalPrice(int amount) {
        return this.price.multiply(BigDecimal.valueOf(amount));
    }

}
