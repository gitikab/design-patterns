package strategy;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackingBehaviour = new Squeak();
        flyingBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
}
