package HomeWork18;

public class CashMachine {
    private String login;
    private double balance ;



    public CashMachine(String login) {
        this.balance = 0d;

        if(login.length() > 4){

            this.login = login.substring(0,4);

        } else this.login = login;

    }



    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getLogin(){
        return this.login;
    }


}
