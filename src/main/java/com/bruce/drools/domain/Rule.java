package com.bruce.drools.domain;

import java.math.BigDecimal;

/**
 * Created by bruce on 2017/4/23.
 */
public class Rule {

    private double weightStart;
    private double weightEnd;

    private double firstWeight;
    private BigDecimal firstWeightPrice;

    private double nextWeight;
    private BigDecimal nextWeightPrice;

    public Rule(double firstWeight, BigDecimal firstWeightPrice, double nextWeight, BigDecimal nextWeightPrice) {
        this.firstWeight = firstWeight;
        this.firstWeightPrice = firstWeightPrice;
        this.nextWeight = nextWeight;
        this.nextWeightPrice = nextWeightPrice;
    }

    public Rule(double weightStart, double weightEnd, double firstWeight, BigDecimal firstWeightPrice, double nextWeight, BigDecimal nextWeightPrice) {
        this.weightStart = weightStart;
        this.weightEnd = weightEnd;
        this.firstWeight = firstWeight;
        this.firstWeightPrice = firstWeightPrice;
        this.nextWeight = nextWeight;
        this.nextWeightPrice = nextWeightPrice;
    }

    public double getFirstWeight() {
        return firstWeight;
    }

    public void setFirstWeight(double firstWeight) {
        this.firstWeight = firstWeight;
    }

    public BigDecimal getFirstWeightPrice() {
        return firstWeightPrice;
    }

    public void setFirstWeightPrice(BigDecimal firstWeightPrice) {
        this.firstWeightPrice = firstWeightPrice;
    }

    public double getNextWeight() {
        return nextWeight;
    }

    public void setNextWeight(double nextWeight) {
        this.nextWeight = nextWeight;
    }

    public BigDecimal getNextWeightPrice() {
        return nextWeightPrice;
    }

    public void setNextWeightPrice(BigDecimal nextWeightPrice) {
        this.nextWeightPrice = nextWeightPrice;
    }

    public double getWeightStart() {
        return weightStart;
    }

    public void setWeightStart(double weightStart) {
        this.weightStart = weightStart;
    }

    public double getWeightEnd() {
        return weightEnd;
    }

    public void setWeightEnd(double weightEnd) {
        this.weightEnd = weightEnd;
    }
}
