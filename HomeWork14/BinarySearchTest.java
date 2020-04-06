package HomeWork14;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    int[] arrayInt;
    BinarySearch binary;

    @Before
    public void setUp(){
        arrayInt = new int[] {1,2,3,4,5,6,7,8,9,10};
        binary = new BinarySearch();
    }

    @Test
    public void binarySearchTest(){

        assertEquals("Different value",3,binary.binarySearch(4,arrayInt));
        assertEquals("Different value",6,binary.binarySearch(7,arrayInt));
    }
}
