package com.bruce.drools;

import com.bruce.drools.domain.Price;
import com.bruce.drools.domain.Product;
import com.bruce.drools.domain.Rule;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.math.BigDecimal;

/**
 * Created by bruce on 2017/4/23.
 */
public class Hello {
    @Test
    public void hello() throws Exception {
        Price price = new Price();

        KieContainer kc = KieServices.Factory.get().getKieClasspathContainer();
        KieSession ksession = kc.newKieSession("sayHello");

        ksession.insert(getRule1());
        ksession.insert(getRule2());
        ksession.insert(new Product(1));

        ksession.insert(price);

        ksession.fireAllRules();

        System.out.println(price.getFirstPrice() + "|" + price.getNextPrice() + "|" + price.getPricce());
    }

    public Rule getRule1() {
        return new Rule(0, 5,2, BigDecimal.ONE, 1, BigDecimal.TEN);
    }

    public Rule getRule2() {
        return new Rule(5, 10,3, BigDecimal.ZERO, 1, BigDecimal.ONE);
    }
}
