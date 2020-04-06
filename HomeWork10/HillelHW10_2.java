package HomeWork10;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class HillelHW10_2 {
    public static void main(String[] args) {
        String[] massiveString = new String[10];
        Integer[] massiveInt = new Integer[20];
        Double[] massiveDouble = new Double[5];
        for(int i = 0; i<massiveString.length;i++){
            massiveString[i] = String.valueOf(i+1);
        }
        for(int i = 0; i<massiveInt.length;i++){
            massiveInt[i] = i+11;
        }
        for(double i = 0; i<massiveDouble.length;i++){
            massiveDouble[(int)i] = i+31;
        }

        Iterator<String> iteratorString = getIterator(massiveString);
        Iterator<Integer> iteratorInt = getIterator(massiveInt);
        Iterator<Double> iteratorDouble = getIterator(massiveDouble);

        while (iteratorString.hasNext()) {
            System.out.print(iteratorString.next()+" ");
        }
        System.out.println(" ");
        while (iteratorInt.hasNext()) {
            System.out.print(iteratorInt.next()+" ");
        }
        System.out.println(" ");
        while (iteratorDouble.hasNext()) {
            System.out.print(iteratorDouble.next()+" ");
        }
    }


    public static <O> Iterator<O> getIterator(O[] array) {
        Iterator<O> iter = new Iterator<O>() {
            public int count = array.length;
            public int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public O next() {
                if (hasNext()) {
                    return array[index++];
                } else {
                    throw new NoSuchElementException("No such element.");
                }
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException("Cannot remove item from array.");
            }
        };
        return iter;
    }
}
