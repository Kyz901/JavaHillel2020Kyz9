package HomeWork6;

public class WildAnimal extends Animal {

    private boolean predator;





    public boolean isPredator() {
        return predator;
    }

    public void setPredator(boolean predator) {
        this.predator = predator;
    }



    @Override
    public void voice() {

        System.out.print("Hello, I`m a wild animal ");
    }
}
