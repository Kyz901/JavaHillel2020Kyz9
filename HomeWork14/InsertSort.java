package HomeWork14;

public class InsertSort {

    public int[] insertSort(int[] someArray){
        for(int marker = 1;marker<someArray.length;marker++){
            int temp = someArray[marker];
            int moved = marker;
            while(moved>0 && someArray[moved-1]>= temp){
                someArray[moved] = someArray[moved-1];
                moved--;

            }
            someArray[moved] = temp;

        }


        return someArray;
    }


}
