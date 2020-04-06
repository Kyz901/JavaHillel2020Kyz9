//package HomeWork12;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.BeforeClass;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class MyStringCollectionTest {
//
//
//    private static MyStringCollection collection;
//    private static MyStringCollection collectionReady;
//
//
//    private String[] expectedAddByValue = {"1", "2", null, null, null, null, null, null, null, null};
//    private String[] expectedAddByIndex = {null, null, null, "1", null, "2", null, null, null, null};
//    private String[] expectedDeleteByValue = {"9", "10", null, null, null, null, null, null, null, null};
//    private String[] expectedDeleteByIndex = {"1", "2", "3", "5", "6", "8", "9", null, null, null,};
//
//    private String[] expectedClear = {null, null, null, null, null, null, null, null, null, null};
//
//
//    @BeforeClass
//    public static void setUpClass() {
//
//
//    }
//
//    @Before
//    public void setUp() {
//
//        collection = new MyStringCollection();
//        collectionReady = new MyStringCollection();
//        for (int i = 1; i < collectionReady.col.length + 1; i++) {
//            collectionReady.add("" + i + "", i - 1);
//        }
//    }
//
//    @After
//    public void load() {
//
//    }
//
//
//    @Test
//    public void addByValueTest() {
//
//        collection.add("1");
//        collection.add("2");
//
//        assertArrayEquals("Different arrays", expectedAddByValue, collection.col);
//        assertEquals("Wrong counter", 2, collection.getCounter());
//
//
//    }
//
//    @Test
//    public void addByIndexTest() {
//
//        collection.add("1", 3);
//        collection.add("2", 5);
//
//        assertArrayEquals("Different arrays", expectedAddByIndex, collection.col);
//        assertEquals("Wrong counter", 2, collection.getCounter());
//
//    }
//
//    @Test
//    public void addByIndexExceptionTest() {
//
//        assertThrows(IndexOutOfBoundsException.class, () -> collection.add("2", -3));
//    }
//
//
//    @Test
//    public void deleteByValueTest() {
//
//        for (int i = 1; i < collectionReady.col.length - 1; i++) {
//            collectionReady.delete("" + i + "");
//        }
//
//        assertArrayEquals("Different arrays", expectedDeleteByValue, collectionReady.col);
//        assertEquals("Wrong counter", 2, collectionReady.getCounter());
//
//    }
//
//    @Test
//    public void deleteByIndexTest() {
//
//        collectionReady.delete(9);
//        collectionReady.delete(6);
//        collectionReady.delete(3);
//
//        assertArrayEquals("Different arrays", expectedDeleteByIndex, collectionReady.col);
//        assertEquals("Wrong counter", 7, collectionReady.getCounter());
//
//    }
//
//    @Test
//    public void deleteByIndexExceptionTest() {
//
//        assertThrows(IndexOutOfBoundsException.class, () -> collection.delete(-3));
//    }
//
//    @Test
//    public void getTest() {
//
//        String actual1 = collectionReady.get(4);
//        String actual2 = collectionReady.get(6);
//
//        assertEquals("Wrong String", "5", actual1);
//        assertEquals("Wrong String", "7", actual2);
//        assertThrows(IndexOutOfBoundsException.class, () -> collection.get(-3));
//    }
//
//    @Test
//    public void getExceptionTest() {
//
//        assertThrows(IndexOutOfBoundsException.class, () -> collection.get(-3));
//    }
//
//    @Test
//    public void containsPositiveTest() {
//        assertTrue("Should be true", collectionReady.isContains("6"));
//
//    }
//
//    @Test
//    public void containsNegativeTest() {
//        assertFalse("Should be false", collectionReady.isContains("11"));
//    }
//
//    @Test
//    public void equalsTest() {
//
//        collection.add("1");
//        collection.add("1");
//        collection.add("2");
//
//        assertTrue("Should be true", collection.isEquals(0, 1));
//        assertFalse("Should be false", collection.isEquals(0, 2));
//        assertThrows(IndexOutOfBoundsException.class, () -> collection.isEquals(-3, -1));
//        assertThrows(IndexOutOfBoundsException.class, () -> collection.isEquals(-3, 1));
//        assertThrows(IndexOutOfBoundsException.class, () -> collection.isEquals(1, -3));
//    }
//    @Test
//    public void equalsExceptionTest() {
//
//        assertThrows(IndexOutOfBoundsException.class, () -> collection.isEquals(-3, -1));
//        assertThrows(IndexOutOfBoundsException.class, () -> collection.isEquals(-3, 1));
//        assertThrows(IndexOutOfBoundsException.class, () -> collection.isEquals(1, -3));
//    }
//    @Test
//    public void equalsPositiveTest() {
//
//        collection.add("1");
//        collection.add("1");
//        collection.add("2");
//
//        assertTrue("Should be true", collection.isEquals(0, 1));
//
//    }
//    @Test
//    public void equalsNegativeTest() {
//
//        collection.add("1");
//        collection.add("1");
//        collection.add("2");
//
//
//        assertFalse("Should be false", collection.isEquals(0, 2));
//
//    }
//
//    @Test
//    public void clearTest() {
//
//        assertArrayEquals("Different arrays", expectedClear, collectionReady.clear());
//
//    }
//
//    @Test
//    public void indexOfTest() {
//
//        collection.add("4", 3);
//        assertEquals("Wrong index", 3, collection.indexOf("4"));
//
//    }
//
//    @Test
//    public void getSizeTest() {
//
//        assertEquals("Wrong size", 10, collectionReady.getSize());
//
//    }
//
//    @Test
//    public void printMasTest() {
//
//        assertTrue("Should be true", collection.printMas());
//
//    }
//
//
//}
