package ro.fasttrackit.curs18.first;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringApplication.class, args);
    }

    @Bean
    public CommandLineRunner atStartup(ApplicationContext context) {
        return args -> {
            System.out.println("Startup!");
            Car myCar = context.getBean(Car.class);
            System.out.println(myCar.drive());
        };
    }

}
