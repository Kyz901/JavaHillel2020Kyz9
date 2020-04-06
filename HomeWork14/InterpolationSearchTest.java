package HomeWork14;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class InterpolationSearchTest {

    InterpolationSearch interpolation;
    int[] arrayInt;

    @Before
    public void setUp() {

        arrayInt = new int[]{1,2,3,4,5,6,7,8,9,10};
        interpolation = new InterpolationSearch();

    }

    @Test
    public void InterpolationSearchTest(){
            assertEquals("Different value",3,interpolation.interpolationSearch(4,arrayInt));
            assertEquals("Different value",6,interpolation.interpolationSearch(7,arrayInt));
    }
}
