package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Animal animal = (Animal) context.getBean("myPet", Animal.class);

//        Animal animal = new Cat();
        Person person = new Person(animal);
        person.callYourAnimal();
        context.close();

    }
}
