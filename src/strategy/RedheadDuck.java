package strategy;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        quackingBehaviour = new Quack();
        flyingBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Redhead Duck");
    }
}
