package app.main;

import app.config.ProjectConfig;
import foo.bar.Cat;
import foo.bar.Parrot;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.catalog.Catalog;

public class Main {
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        beanContextAddition(context);

        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());
    }

    private static void beanContextAddition(AnnotationConfigApplicationContext context) {

        final Cat cat = context.getBean("murka", Cat.class);
        System.out.println(cat.getName());

        final Cat stella = context.getBean("stella", Cat.class);
        System.out.println(stella.getName());


        final String helloWorld = context.getBean(String.class);
        final Integer dozen = context.getBean(Integer.class);
        System.out.println(helloWorld);
        System.out.println(dozen);

        final Cat defaultCat = context.getBean(Cat.class);
        System.out.println(defaultCat.getName());
    }
}
