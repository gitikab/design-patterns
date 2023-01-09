package strategy;

public class DecoyDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Decoy duck");
    }

    @Override
    public void quack() {
        System.out.println("No sound");
    }

    @Override
    public void fly() {
        System.out.println("Cannot Fly");
    }
}
