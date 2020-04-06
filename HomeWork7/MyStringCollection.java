package HomeWork7;

public class MyStringCollection {
    String[] col;
    String[] tempCol;
    private int ensure;
    private int counter = 0;
    private int countSize;

    public MyStringCollection() {
        col = new String[10];
    }

    public void printMas() {

        for (int i = 0; i < col.length; i++) {
            System.out.print(col[i] + " ");


        }
        System.out.println(" ");
    }

    public void add(String value) {
        if (counter == col.length) {
            ensure = col.length;
            tempCol = new String[ensure];
            System.arraycopy(col, 0, tempCol, 0, col.length);
            col = new String[(ensure * 3) / 2 + 1];
            System.arraycopy(tempCol, 0, col, 0, counter);


        }
        col[counter] = value;
        counter++;
        countSize++;
    }

    public void add(String value, int index) {
        if (index >= col.length) {
            ensure = col.length;
            tempCol = new String[ensure];
            System.arraycopy(col, 0, tempCol, 0, col.length);
            col = new String[(ensure * 3) / 2 + 1];
            System.arraycopy(tempCol, 0, col, 0, counter);


        }
        col[index] = value;
        countSize++;
    }

    public void delete(String value) {
        for (int i = 0; i < col.length; i++) {
            if (value.equalsIgnoreCase(col[i])) {
                col[i] = null;
                int moved = col.length - i - 1;
                System.arraycopy(col, i + 1, col, i, moved);
                break;
            }

        }
        countSize--;
    }

    public void delete(int index) {
        int moved = col.length - index - 1;
        System.arraycopy(col, index + 1, col, index, moved);
        col[col.length - 1] = null;
        countSize--;
    }

    public String get(int index) {
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
        boolean state = false;
        if (col[index1].equalsIgnoreCase(col[index2])) {
            state = true;
        } else {
            state = false;
        }
        return state;
    }

    public void clear() {
        col = new String[10];
        countSize = 0;
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
