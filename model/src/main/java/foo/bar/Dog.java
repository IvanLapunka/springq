package foo.bar;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@Component
public class Dog {
    String name;

    @PostConstruct
    void init() {
        setName("Graph");
    }
}
