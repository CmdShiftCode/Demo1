package IPrinciple.BadExample;

public class Dog implements Animal {

    @Override
    public void fly() {
    
        System.out.println("Dog cannot fly - but still it has to provide implementation for this function");
    }

    @Override
    public void swim() {

        System.out.println("Dog can swim");
    }

}
