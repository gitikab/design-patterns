package strategy;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackingBehaviour = new MuteQuack();
        flyingBehaviour = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("Decoy duck");
    }
}
