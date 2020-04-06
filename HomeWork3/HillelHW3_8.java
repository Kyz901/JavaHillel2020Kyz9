package HomeWork3;

public class HillelHW3_8 {
    public static void main(String[] args) {
        int [] massOfOddNums = new  int[10];
        for(int i=0,j=1;i<massOfOddNums.length;i++,j+=2){
           if(j%2!=0){
               massOfOddNums[i] = j;
           }
        }

        for(int i=0;i<massOfOddNums.length;i++){
            System.out.print(massOfOddNums[i]+", ");
        }
    }
}
