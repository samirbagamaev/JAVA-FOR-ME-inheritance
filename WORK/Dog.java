package WORK;

public class Dog extends Animal { // Класс Dog РАСШИРЯЕТ класс Animal, Animal является родителем класса Dog

    public void eat() {
        System.out.println("Dog is eating");
    }

    public void bark() { // bark = лаять
        System.out.println("I am barking");

    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void showName(){
        System.out.println(name);
    }

}
