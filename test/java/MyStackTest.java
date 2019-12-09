import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {


    @Test
    public void testIsEmpty() {
        MyStack<Integer> testStack = new MyStack<>();
        assertEquals(testStack.isEmpty(), true);
    }

    @Test
    public void testPush() {
        MyStack<Integer> testStack = new MyStack<>();
        testStack.push(3);
        int expected = testStack.peek();
        assertEquals(expected, 3);
    }

    @Test
    public void testPop() {
        MyStack<Integer> testStack = new MyStack<>();
        testStack.push(2);
        testStack.push(3);
        testStack.pop();
        int expected = testStack.peek();
        assertEquals(expected, 2);
    }

}
