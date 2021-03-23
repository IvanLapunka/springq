package foo.bar;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class Person {
    String name;
    Parrot parrot;
    Cat cat;
    @Autowired
    Dog dog;
}
