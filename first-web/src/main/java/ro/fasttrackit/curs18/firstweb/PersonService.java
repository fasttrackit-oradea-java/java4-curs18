package ro.fasttrackit.curs18.firstweb;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    public List<Person> getPersons() {
        return List.of(
                new Person("Ioan", 33),
                new Person("Horea", 13),
                new Person("Mircea", 43),
                new Person("Dana", 23),
                new Person("Carla", 53)
        );
    }
}
