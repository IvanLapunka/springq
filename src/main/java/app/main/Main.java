package app.main;

import app.config.ProjectConfig;
import foo.bar.Cat;
import foo.bar.Dog;
import foo.bar.Parrot;
import foo.bar.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.catalog.Catalog;

public class Main {
    public static void main(String[] args) {
        final var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        beanContextAddition(context);
//        getPrimaryBean(context);

        final Person person = context.getBean(Person.class);
        System.out.println(person.getName());

        final Parrot parrot = context.getBean("parrot", Parrot.class);
        System.out.println(parrot);

        final Cat kitty = context.getBean("kitty", Cat.class);
        System.out.println(kitty);

        System.out.println(person.getCat());
        System.out.println(person.getParrot());
        System.out.println(person.getDog());
    }

    private static void getPrimaryBean(AnnotationConfigApplicationContext context) {
        //primary bean
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
