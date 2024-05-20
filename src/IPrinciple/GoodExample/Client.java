package IPrinciple.GoodExample;


public class Client {
    public static void main(String[] args) {
        AnimalFeatureGE animalFeatureGE = new AnimalFeatureGE();

        FlyableAnimal duck = new DuckGE();
        SwimableAnimal dog = new DogGE();

        animalFeatureGE.performfly(duck);
        animalFeatureGE.performSwim(dog);
    }

}
