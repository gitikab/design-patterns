package strategy;

public abstract class Duck implements FlyingBehaviour, QuackingBehaviour {

    @Override
    public void quack() {
        System.out.println("quack quack");
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public abstract void display();

    @Override
    public void fly() {
        System.out.println("Fly");
    }
}
