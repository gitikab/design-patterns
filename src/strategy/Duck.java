package strategy;

public abstract class Duck {

    public void quack() {
        System.out.println("quack quack");
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public abstract void display();

    public void fly() {
        System.out.println("Fly");
    }
}
