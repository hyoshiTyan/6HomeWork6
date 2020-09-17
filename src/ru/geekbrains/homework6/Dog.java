package ru.geekbrains.homework6;

class Dog extends Animal {
    private  int run_length = 500;
    private  int swim_length = 10;
    private  double jump_length = 0.5;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= run_length))
            System.out.println("Dog run " + length + " : true");
        else System.out.println("Dog run " + length + " : false");

    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= swim_length))
            System.out.println("Dog swim " + length + " : true");
        else System.out.println("Dog swim " + length + " : false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= jump_length))
            System.out.println("Dog jump " + height + " : true");
        else System.out.println("Dog jump " + height + " : false");
    }
}
