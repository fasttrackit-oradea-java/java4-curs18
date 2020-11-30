package ro.fasttrackit.curs18.first;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public Engine() {
        System.out.println("Creating engine " + this);
    }

    public String getPower() {
        return "power";
    }
}
