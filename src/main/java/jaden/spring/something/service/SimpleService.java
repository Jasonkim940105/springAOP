package jaden.spring.something.service;


import jaden.spring.something.common.PerfLogging;
import jaden.spring.something.common.SayHello;
import org.springframework.stereotype.Service;

@Service
public class SimpleService implements EventService{
    @PerfLogging
    public void createEvent() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Create an Event");
    }

    @PerfLogging
    @SayHello
    public void publishEvent() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Publish an Event");
    }


    public void deleteEvent() {
        System.out.println("Delete an Event");
    }
}
