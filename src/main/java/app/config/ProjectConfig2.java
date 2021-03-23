package app.config;

import foo.bar2.Rat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("foo.bar2")
public class ProjectConfig2 {
    @Bean
    Rat rat() {
        Rat rat = new Rat("First");
        return rat;
    }

    @Bean
    Rat rat2() {
        Rat rat = new Rat("Second");
        return rat;
    }
}
