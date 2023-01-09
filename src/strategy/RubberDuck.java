package strategy;

public class RubberDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }

    @Override
    public void quack() {
        System.out.println("squeak squeak");
    }

    @Override
    public void fly() {
        System.out.println("Cannot Fly");
    }
}
