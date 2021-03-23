package foo.bar2;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Hole {
    String name = "Blue hole";
    Rat rat;
    public Hole(Rat rat2) {
        this.rat = rat2;
    }
}
