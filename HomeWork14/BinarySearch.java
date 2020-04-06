package HomeWork14;

public class BinarySearch {

    public  int binarySearch(int needToFind,int[] someArray){
            int min = 0;
            int max = someArray.length-1;
            int mid;
            while(true){
                mid = (min+max)/2;
                if(someArray[mid]==needToFind){
                    return mid;
                } else {
                    if(someArray[mid]>needToFind){
                        max = mid-1;
                    }
                    else {
                        min = mid+1;
                    }
                }
            }

    }
}
