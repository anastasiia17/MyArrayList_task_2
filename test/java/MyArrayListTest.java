import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    MyArrayList<Integer> MyList = new MyArrayList<>();

    @Test
    public void testNullSize() {
        assertEquals(0, MyList.size());
    }

    @Before
    public void setUp() {
        MyList.add(2);
        MyList.add(7);
        MyList.add(1);
    }

    @Test
    public void testIsEmpty() {
        assertEquals(MyList.isEmpty(), false);
    }


    @Test
    public void testContains() {
        assertEquals(MyList.contains(5), false);
        assertEquals(MyList.contains(1), true);
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
