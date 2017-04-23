package com.bruce.drools.domain;

import java.math.BigDecimal;

/**
 * Created by bruce on 2017/4/23.
 */
public class Price {
    private BigDecimal firstPrice;
    private BigDecimal nextPrice;

    private BigDecimal pricce;

    public BigDecimal getFirstPrice() {
        return firstPrice;
    }

    public void setFirstPrice(BigDecimal firstPrice) {
        this.firstPrice = firstPrice;
    }

    public BigDecimal getNextPrice() {
        return nextPrice;
    }

    public void setNextPrice(BigDecimal nextPrice) {
        this.nextPrice = nextPrice;
    }

    public BigDecimal getPricce() {
        return pricce;
    }

    public void setPricce(BigDecimal pricce) {
        this.pricce = pricce;
    }
}
