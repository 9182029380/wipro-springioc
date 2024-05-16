package org.wipro.Mobileapplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello");
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Sim sim = (Sim) context.getBean("sim");
        sim.calling();
        sim.data();

    }
}
