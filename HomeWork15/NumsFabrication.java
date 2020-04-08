package HomeWork15;

public class NumsFabrication {
        static String resFirst =   "";
        static String resSecond =  "";
        static String resThird =   "";
        static String resFourth =  "";
        static String resFifth =   "";
        static String resSixth =   "";
        static String resSeventh = "";

        public static boolean isAllCharIsNumber(String needToCheck){
                char[] intoCharArray = needToCheck.toCharArray();
                for(int i = 0;i<intoCharArray.length;i++){
                        if(intoCharArray[i] < 48 || intoCharArray[i]>57){
                                return false;
                        }
                }
                return true;
        }

        public static void drawNumbers(String needToDraw){
                if(isAllCharIsNumber(needToDraw)) {
                        concatRes(needToDraw);
                        System.out.println(resFirst);
                        System.out.println(resSecond);
                        System.out.println(resThird);
                        System.out.println(resFourth);
                        System.out.println(resFifth);
                        System.out.println(resSixth);
                        System.out.println(resSeventh);
                        clearBuffer();
                } else {
                        System.out.println("----------------------------------------------");
                        System.out.println("Some chars aren`t numbers, check and repeat...");
                        System.out.println("----------------------------------------------");
                }

        }
        public static void clearBuffer(){
                 resFirst =   "";
                 resSecond =  "";
                 resThird =   "";
                 resFourth =  "";
                 resFifth =   "";
                 resSixth =   "";
                 resSeventh = "";
        }
        public static void concatRes(String numbers){

                char[] intoChar = numbers.toCharArray();
                for(int i = 0;i<intoChar.length;i++){
                        DrawNumber firstNumber = getNumber(intoChar[i]);
                        resFirst += firstNumber.getFirstString();
                        resSecond += firstNumber.getSecondString();
                        resThird += firstNumber.getThirdString();
                        resFourth += firstNumber.getFourthString();
                        resFifth += firstNumber.getFifthString();
                        resSixth += firstNumber.getSixthString();
                        resSeventh += firstNumber.getSeventhString();
                }
        }

        public static DrawNumber getNumber(char number) {
                if(number=='0')
                        return new Zero();
                else if(number=='1')
                        return new One();
                else if(number=='2')
                        return new Two();
                else if(number=='3')
                        return new Three();
                else if(number=='4')
                        return new Four();
                else if(number=='5')
                        return new Five();
                else if(number=='6')
                        return new Six();
                else if(number=='7')
                        return new Seven();
                else if(number=='8')
                        return new Eight();
                else if(number=='9')
                        return new Nine();
                else return new Number();
        }

}
