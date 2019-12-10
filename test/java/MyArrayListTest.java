import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    MyArrayList<Integer> myList = new MyArrayList<>();

    @Test
    public void testNullSize() {
        assertEquals(0, myList.size());
    }

    @Before
    public void setUp() {
        myList.add(2);
        myList.add(7);
        myList.add(1);
    }

    @Test
    public void testIsEmpty() {
        assertEquals(myList.isEmpty(), false);
    }


    @Test
    public void testContains() {
        assertEquals(myList.contains(5), false);
        assertEquals(myList.contains(1), true);
    }

    @Test
    public void testGet() {
        MyArrayList<Integer> testList = new MyArrayList<>();
        testList.add(0, 42);
        testList.add(1, 3);
        testList.add(2, 4);
        int expected = testList.get(2);
        assertEquals(expected, 4);
    }

    @Test
    public void testRemove() {
        MyArrayList<Integer> testList2 = new MyArrayList<>();
        testList2.add(0, 42);
        testList2.add(1, 3);
        testList2.add(2, 4);
        testList2.remove(1);
        int expected = testList2.get(1);
        assertEquals(expected, 4);
        assertEquals(testList2.size(), 2);

    }


}
