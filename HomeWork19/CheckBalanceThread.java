package HomeWork19;

public class CheckBalanceThread extends Thread{

    CashMachine cashMachine;
    String login;
    public CheckBalanceThread(String name,String login) {
        super(name);
        this.login = login;
    }

    @Override
    public void run() {
        loginCheck(login);
        System.out.println();
        System.out.println(" "+getName()+" - проверка счета - "+ cashMachine.getBalance());
        System.out.println();
    }
    public boolean loginCheck(String login){

        if(HashMaps.hashMapOfPins.containsKey(login)){
            cashMachine = (CashMachine) HashMaps.hashMapOfPins.get(login);

            return true;
        } else {
            cashMachine = new CashMachine(login);
            HashMaps.hashMapOfPins.put(login,cashMachine);


            return false;
        }
    }
}
