import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack<T> extends MyArrayList<T> {
    //private int top;
    private MyArrayList<T> stackArray;

    MyStack() {
        stackArray = new MyArrayList<>();
    }

    @Override
    public boolean isEmpty() {
        return stackArray.isEmpty();
    }


    public T push(T element) {
        stackArray.add(element);
        return element;
    }

    public T pop() {
        T element = this.peek();
        stackArray.remove(stackArray.size() - 1);
        return element;
    }

    public T peek() {
        if (this.stackArray.isEmpty()) {
            throw new EmptyStackException();
        }
        return stackArray.get(stackArray.size() - 1);
    }

}
