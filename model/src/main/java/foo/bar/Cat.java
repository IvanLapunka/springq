package foo.bar;

import lombok.Data;

@Data
public class Cat {
    String name;
    public Cat() {
        System.out.println("The cat was created!");
    }
}
