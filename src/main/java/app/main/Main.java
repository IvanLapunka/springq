package app.main;

import app.config.ProjectConfig;
import foo.bar.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.catalog.Catalog;

public class Main {
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        final Cat cat = context.getBean(Cat.class);
        System.out.println(cat.getName());
    }
}
