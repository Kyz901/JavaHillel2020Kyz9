package HomeWork6;

public class GuideDog extends Dog implements GuideDogMethods{
    private boolean isTrained = true;



    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }



    @Override
    public void voice() {
        super.voice();
        System.out.println("I can take you home.");

    }
    @Override
    public void goHome(){
        System.out.println("* takes home *");
    }




}
