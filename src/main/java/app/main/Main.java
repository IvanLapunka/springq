package app.main;

import app.config.ProjectConfig;
import foo.bar.Cat;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.catalog.Catalog;

public class Main {
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        final Cat cat = context.getBean("cat",Cat.class);
        System.out.println(cat.getName());

        final String helloWorld = context.getBean(String.class);
        final Integer dozen = context.getBean(Integer.class);
        System.out.println(helloWorld);
        System.out.println(dozen);
    }
}
