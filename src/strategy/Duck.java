package strategy;

public abstract class Duck {

    protected FlyingBehaviour flyingBehaviour;
    protected QuackingBehaviour quackingBehaviour;

    public void performQuack() {
        quackingBehaviour.quack();
    }

    public void swim() {
        System.out.println("Swimming");
    }

    public abstract void display();

    public void performFly() {
        flyingBehaviour.fly();
    }

    public void setFlyingBehaviour(FlyingBehaviour flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public void setQuackingBehaviour(QuackingBehaviour quackingBehaviour) {
        this.quackingBehaviour = quackingBehaviour;
    }
}
