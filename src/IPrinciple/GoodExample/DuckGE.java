package IPrinciple.GoodExample;

public class DuckGE implements SwimableAnimal, FlyableAnimal {

    @Override
    public void fly() {
        
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        
        System.out.println("Duck can swim");
    }

}
