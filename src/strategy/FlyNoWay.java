package strategy;

public class FlyNoWay implements FlyingBehaviour{
    @Override
    public void fly() {
        System.out.println("No Fly");
    }
}
