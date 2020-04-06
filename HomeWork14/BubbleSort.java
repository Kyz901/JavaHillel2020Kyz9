package HomeWork14;


public class BubbleSort {

    public int[] bubbleSortIntArray(int[] someArray){

        for(int i = someArray.length-1;i>=1;i--){
            for(int j = 0;j<i;++j){
                if(someArray[j] > someArray[j+1]){
                    int temp = someArray[j];
                    someArray[j] = someArray[j+1];
                    someArray[j+1] = temp;

                }

            }
        }
        return someArray;
    }


}
