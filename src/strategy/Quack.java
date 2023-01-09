package strategy;

public class Quack implements QuackingBehaviour{
    @Override
    public void quack() {
        System.out.println("quack quack");
    }
}
