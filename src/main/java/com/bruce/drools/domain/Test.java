package com.bruce.drools.domain;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.math.BigDecimal;

/**
 * Created by bruce on 2017/4/23.
 */
public class Test {

    public static Rule getRule1() {
        return new Rule(0, 5,2, new BigDecimal(2), 1, new BigDecimal(1));
    }

    public static Rule getRule2() {
        return new Rule(5, 10,3, new BigDecimal(3), 1, new BigDecimal(2));
    }

    public static void main(String[] args) {
        Price price = new Price();

        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("helloKS");

        ksession.insert(getRule1());
        ksession.insert(getRule2());
        ksession.insert(new Product(5));

        ksession.insert(price);

        ksession.fireAllRules();

        System.out.println(price.getFirstPrice() + "|" + price.getNextPrice() + "|" + price.getPricce());
    }
}
