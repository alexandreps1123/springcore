package com.parkus.lifecycle.ticketreservation;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("com/parkus/lifecycle/ticketreservation/config.xml");

        TicketReservation patient = (TicketReservation) ctx.getBean("ticketreservation");

        System.out.println(patient);

        // pre shutdown hook
        ctx.registerShutdownHook();
    }
}
