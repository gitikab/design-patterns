package strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackingBehaviour = new Quack();
        flyingBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Mallard Duck");
    }
}
