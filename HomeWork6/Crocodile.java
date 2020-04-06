package HomeWork6;

public class Crocodile extends WildAnimal {


    @Override
    public void voice() {

        super.voice();
        if (super.isPredator()) {
            System.out.println("and i`m angry");
        }
    }


}
