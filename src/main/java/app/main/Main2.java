package app.main;

import app.config.ProjectConfig2;
import foo.bar2.Hole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main2 {
    public static void main(String[] args) {
        final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig2.class);
        Hole hole = context.getBean(Hole.class);
        System.out.println(hole);
    }
}
