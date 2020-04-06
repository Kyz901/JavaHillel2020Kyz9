package HomeWork6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        GuideDog guideDog = new GuideDog();
        Fish fish = new Fish();
        Hamster hamster = new Hamster();
        Crocodile crocodile = new Crocodile();
        Giraffe giraffe = new Giraffe();
        Wolf wolf = new Wolf();
        Lion lion = new Lion();
        cat.setName("Cat");
        dog.setName("Dog");
        guideDog.setName("Guide dog");
        hamster.setName("Hamster");
        crocodile.setPredator(true);
        lion.setPredator(true);
        wolf.setPredator(true);
        giraffe.setPredator(false);

        System.out.println("Pets:   ");
        System.out.println(" ");
        cat.voice();
        System.out.println(" ");

        dog.voice();
        System.out.println(" ");

        guideDog.voice();
        guideDog.goHome();
        System.out.println(" ");

        fish.voice();
        System.out.println(" ");

        hamster.voice();
        System.out.println(" ");

        System.out.println("Wild Animal:  ");
        System.out.println(" ");

        crocodile.voice();
        System.out.println(" ");

        giraffe.voice();
        System.out.println(" ");

        wolf.voice();
        System.out.println(" ");

        lion.voice();
        System.out.println(" ");





    }
}
