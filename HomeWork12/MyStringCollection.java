package HomeWork12;

public class MyStringCollection {
    String[] col;
    String[] tempCol;
    private int ensure;
    private int counter = 0;
    private int countSize;


    public int getCountSize() {
        return countSize;
    }


    public int getCounter() {
        return counter;
    }


    public MyStringCollection() {
        col = new String[10];
    }

    public boolean printMas() {

        for (int i = 0; i < col.length; i++) {
            System.out.print(col[i] + " ");


        }
        System.out.println(" ");
        return true;
    }

    public String[] add(String value) {


            if (counter == col.length) {
                ensure = col.length;
                tempCol = new String[ensure];
                System.arraycopy(col, 0, tempCol, 0, col.length);
                col = new String[(ensure * 3) / 2 + 1];
                System.arraycopy(tempCol, 0, col, 0, counter);


            }
            if (col[counter] == null) {
                col[counter] = value;
            } else if (col[counter] != null) {
                counter++;
                col[counter] = value;
            }
            counter++;
            countSize++;

        return col;
    }

    public String[] add(String value, int index) {

            if(index<0){
                throw new IndexOutOfBoundsException("Index out of bounds");
            }


            if (index >= col.length) {
                ensure = col.length;
                tempCol = new String[ensure];
                System.arraycopy(col, 0, tempCol, 0, col.length);
                col = new String[(ensure * 3) / 2 + 1];
                System.arraycopy(tempCol, 0, col, 0, counter);


            }
            if (col[index] != null) {
                col[index] = value;

            } else if (col[index] == null) {
                col[index] = value;
                counter++;
                countSize++;
            }


        return col;
    }

    public String[] delete(String value) {
        for (int i = 0; i < col.length; i++) {
            if (value.equalsIgnoreCase(col[i])) {
                col[i] = null;
                int moved = col.length - i - 1;
                System.arraycopy(col, i + 1, col, i, moved);
                col[col.length - 1] = null;
                break;
            }

        }
        counter--;
        countSize--;
        return col;
    }

    public String[] delete(int index) {

        if(index<0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        int moved = col.length - index - 1;
        System.arraycopy(col, index + 1, col, index, moved);
        col[col.length - 1] = null;
        counter--;
        countSize--;
        return col;
    }

    public String get(int index) {
        if(index<0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return col[index];
    }

    public boolean isContains(String value) {
        boolean state = true;
        for (int i = 0; i < col.length; i++) {

            if (value.equalsIgnoreCase(col[i])) {
                state = true;

                break;

            } else {
                state = false;


            }


        }
        return state;
    }

    public boolean isEquals(int index1, int index2) {
        if(index1<0|| index2<0){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        boolean state = false;
        if (col[index1].equalsIgnoreCase(col[index2])) {
            state = true;
        } else {
            state = false;
        }
        return state;
    }

    public String[] clear() {
        col = new String[10];
        countSize = 0;
        return col;
    }

    public int indexOf(String value) {
        int index = -1;
        for (int i = 0; i < col.length; i++) {
            if (value.equalsIgnoreCase(col[i])) {
                index = i;
                break;
            }

        }
        return index;
    }

    public int getSize() {
        return countSize;
    }


}
