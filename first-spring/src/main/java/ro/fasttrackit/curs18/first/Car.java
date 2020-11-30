package ro.fasttrackit.curs18.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;

    @Autowired
    public Car(Engine engine) {
        this.engine = engine;
        System.out.println("Creating Car with engine " + engine);
    }

    public Car(String ceva, Engine engine) {
        this(engine);
        System.out.println(ceva);
    }

    public String drive() {
        return "vrooom " + engine.getPower();
    }
}
