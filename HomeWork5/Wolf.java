package HomeWork5;

public class Wolf extends WildAnimal {


    @Override
    public void voice() {
        super.voice();
        if (super.isPredator()) {
            System.out.println(" and i`m angry");
        }
    }


}
