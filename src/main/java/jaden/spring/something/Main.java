package jaden.spring.something;

import jaden.spring.something.service.EventService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new GenericXmlApplicationContext("applicationContext.xml");

        EventService eventService = ctx.getBean("simpleService", EventService.class);


        eventService.createEvent();
        eventService.publishEvent();
        eventService.deleteEvent();



    }
}
