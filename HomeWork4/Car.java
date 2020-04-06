package HomeWork4;

public class Car {
    float volumeOfFuel =53;
    float balanceOfFuel = 0;
    float consumptionPer100km = (float) 4.4;

    public Car(float consumptionPer100km,float volumeOfFuel) {
        this.consumptionPer100km = consumptionPer100km;
        this.volumeOfFuel = volumeOfFuel;
    }

    void fullFuel(){
        float neededFuel = volumeOfFuel - balanceOfFuel;
        balanceOfFuel += neededFuel;

    }
    float valueNeededFuelAfterN(float N){
        float calculatedNeededFuel = N * consumptionPer100km/100;
        return calculatedNeededFuel;
    }
    float valueBalanceOfFuelAfterN(float N){
        float calculatedBalanceOfFuel = balanceOfFuel - (N * consumptionPer100km/100);
        return calculatedBalanceOfFuel;
    }


}
