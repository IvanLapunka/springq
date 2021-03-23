package foo.bar2;

import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Data
@Component
public class Hole {
    String name = "Blue hole";
    Rat rat;
    public Hole(@Qualifier("rat") Rat rat) {
        this.rat = rat;
    }
}
