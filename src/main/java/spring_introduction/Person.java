package spring_introduction;

public class Person {
    private Animal animal;
    public Person(Animal animal) {
        this.animal = animal;
    }

    public void callYourAnimal() {
        System.out.println("Hello, my dear!");
        animal.say();
    }
}
