package app.config;

import foo.bar.Cat;
import foo.bar.Parrot;
import foo.bar.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "foo.bar")
public class ProjectConfig {

    @Bean
    Person person(Parrot parrot2) {
        Person person = new Person();
        person.setName("Vasja");
        person.setCat(cat2());
        person.setParrot(parrot2);
        return person;
    }

    @Bean
    Parrot parrot() {
        Parrot parrot = new Parrot();
        parrot.setName("Stepa");
        return parrot;
    }

    @Bean
    Parrot parrot2() {
        Parrot parrot = new Parrot();
        parrot.setName("Kesha");
        return parrot;
    }
    ////////////////////////
    @Bean(name = "kitty")
    @Primary
    Cat cat() {
        final Cat cat = new Cat();
        cat.setName("Puppy");
        return cat;
    }

    @Bean(value = "murka")
    Cat cat2() {
        final Cat cat = new Cat();
        cat.setName("Murka");
        return cat;
    }

    @Bean("stella")
    Cat cat3() {
        final Cat cat = new Cat();
        cat.setName("Stella");
        return cat;
    }

    @Bean
    String helloWorld() {
        return "Hello world";
    }

    @Bean
    Integer dozen() {
        return 100;
    }
}
