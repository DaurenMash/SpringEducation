package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal animal = (Animal) context.getBean("myPet", Animal.class);
        animal.say();
        context.close();
    }
}
