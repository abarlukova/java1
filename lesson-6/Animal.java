package geekbrains.lesson_3.lesson_6;

public abstract class Animal {

    protected String name;

    public Animal () {

    }

    protected abstract boolean run (double parameter);

    protected abstract boolean swim(double parameter);

    protected abstract boolean jump (double parameter);
}


class Cat extends Animal {



    public Cat(String name) {
        super.name = name;
    }

   @Override
    protected boolean run(double parameter) {
        return (200>=parameter);
    }


    @Override
    protected boolean jump(double parameter) {
        return (2>=parameter);
    }

    @Override
    protected boolean swim(double parameter) {
        return false;
    }

}

class Dog extends Animal {

    protected double paramRun;

    public Dog(String name, double paramRun) {
        super.name = name;
        this.paramRun = paramRun;
    }

    public Dog(String name){
        super.name = name;
        this.paramRun = 500;
    }

    @Override
    protected boolean run(double parameter) {
        return (paramRun >= parameter);
    }


    @Override
    protected boolean jump(double parameter) {
        return (0.5 >= parameter);
    }

    @Override
    protected boolean swim(double parameter) {
        return (10 >= parameter);
    }

}


class MainClass {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        System.out.println(cat1.swim(300));

        Dog dog1 = new Dog("Sharik", 600);
        System.out.println(dog1.run(550));

    }

}

