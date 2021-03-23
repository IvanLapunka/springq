package foo.bar;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import java.beans.PersistenceDelegate;

@Data
public class Person {
    String name;
    Parrot parrot;
    Cat cat;
    Dog dog;

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public Person() {}

    @Autowired
    public Person(Dog dog) {
        setDog(dog);
    }
}
