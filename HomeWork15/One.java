package HomeWork15;

public class One implements DrawNumber {
    final public String firstString =    "        ";
    final public String secondString =   "   @@   ";
    final public String thirdString =    "  @@@   ";
    final public String fourthString =   " @ @@   ";
    final public String fifthString =    "   @@   ";
    final public String sixthString =    " @@@@@@ ";
    final public String seventhString =  "        ";

    public String getFirstString() {
        return firstString;
    }

    public String getSecondString() {
        return secondString;
    }

    public String getThirdString() {
        return thirdString;
    }

    public String getFourthString() {
        return fourthString;
    }

    public String getFifthString() {
        return fifthString;
    }

    public String getSixthString() {
        return sixthString;
    }

    public String getSeventhString() {
        return seventhString;
    }
    @Override
    public void drawNumber() {
        System.out.println(firstString);
        System.out.println(secondString);
        System.out.println(thirdString);
        System.out.println(fourthString);
        System.out.println(fifthString);
        System.out.println(sixthString);
        System.out.println(seventhString);

    }
}
