package ru.geekbrains.homework6;

class Cat extends Animal {
    private int run_length = 200;
    private double jump_length = 2;
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= run_length))
            System.out.println("Cat run " + length + " : true");
        else System.out.println("Cat run " + length + " : false");
    }

    @Override
    void swim(int length) {
        System.out.println("Cat swim: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= jump_length))
            System.out.println("Cat jump " + height + " : true");
        else System.out.println("Cat jump " + height + " : false");
    }
}







