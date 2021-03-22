package foo.bar;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@Component
public class Parrot {
    private String name;

    @PostConstruct
    private void init() {//method run after the object has been created
        setName("Kesha");
    }
}
