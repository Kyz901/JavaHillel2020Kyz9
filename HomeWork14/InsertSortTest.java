package HomeWork14;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public class InsertSortTest {

    InsertSort insert;
    int[] arrayInt;

    @Before
    public void setUp() {

        arrayInt = new int[]{10,9,8,7,6,5,4,3,2,1};
        insert = new InsertSort();

    }
    @Test
    public void insertSortTest(){
        insert.insertSort(arrayInt);
        assertArrayEquals("Different arrays",new int[] {1,2,3,4,5,6,7,8,9,10},arrayInt);
    }

}
