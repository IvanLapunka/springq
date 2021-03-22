package app.config;

import foo.bar.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Cat cat() {
        final Cat cat = new Cat();
        cat.setName("Puppy");
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
