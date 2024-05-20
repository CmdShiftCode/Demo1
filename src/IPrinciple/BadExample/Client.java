package IPrinciple.BadExample;

public class Client {

    public static void main(String[] args) {

        AnimalFeature animalFeature = new AnimalFeature();

        Animal dog = new Dog();
        Animal duck = new Duck();

        animalFeature.animalFly(dog);
        animalFeature.animalSwim(duck);
    }
}
