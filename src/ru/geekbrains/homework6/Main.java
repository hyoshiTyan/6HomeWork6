package ru.geekbrains.homework6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(400);
        cat.swim(1);
        cat.jump(2);

        Dog dog = new Dog();
        dog.run(600);
        dog.swim(10);
        dog.jump(0.5);
    }
}
