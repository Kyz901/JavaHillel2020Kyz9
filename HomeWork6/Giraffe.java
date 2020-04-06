package HomeWork6;

public class Giraffe extends WildAnimal {



    @Override
    public void voice() {
        super.voice();
        if (super.isPredator()) {
            System.out.println(" and i`m angry");
        }
    }


}
