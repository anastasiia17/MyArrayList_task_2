import java.util.*;


public class MyArrayList<T> implements List<T> {
    private Object[] array;
    private int size;
    private int capacity;
    private final int STARTED_MAX_CAPACITY = 10;
    private final int INCREASES_CAPACITY = 10;

    MyArrayList() {
        this.capacity = STARTED_MAX_CAPACITY;
        this.size = 0;
        this.array = new Object[STARTED_MAX_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.array = new Object[initialCapacity];
            this.capacity = initialCapacity;
        } else {
            throw new IllegalArgumentException("Invalid capacity" + initialCapacity);
        }
    }

    public void increaseArrayCapacity() {
        int newCapacity = this.capacity + INCREASES_CAPACITY;
        Object[] tmp = new Object[newCapacity];
        System.arraycopy(this.array, 0, tmp, 0, this.capacity);
        this.array = tmp;
        this.capacity = newCapacity;
    }


    public void printArray() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.array[i]);
        }
    }

    @Override
    public int size() {
        return this.size;
    }


    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public boolean add(T t) {
        if (this.size == this.capacity) {
            increaseArrayCapacity();
        }
        this.array[this.size] = t;
        this.size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public void add(int index, T t) {
        if (this.size == this.capacity) {
            increaseArrayCapacity();
        }
        if (index > this.size || index < 0) {
            throw new IllegalArgumentException("Trying put element to incorrect position");
        }
        if (this.size - index >= 0) {
            System.arraycopy(this.array, index, this.array, index + 1, this.size - index);
        }
        this.array[index] = t;
        this.size++;
    }


    @Override
    public T get(int index) {
        if (index > this.size || index < 0) {
            throw new IllegalArgumentException("Trying get out of bounds element");
        }
        return (T) this.array[index];
        //return (T) this.array[index];
    }

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public T remove(int index) {
        Object tmp = this.array[index];
        if (this.size == 0) {
            throw new NullPointerException("The list is empty");
        }
        if (index >= this.size || index < 0) {
            throw new IllegalArgumentException("Trying remove element which is out of array's bounds");
        }
        if (this.size - index >= 0) {
            System.arraycopy(this.array, index + 1, this.array, index, this.size - index);
        }
        this.array[--size] = null;
        return (T) tmp;
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Unsupported operation");
    }

    public boolean contains(Object o) {
        for (int i = 0; i <= this.size; i++) {
            if (o.equals(this.array[i])) {
                return true;
            }
        }
        return false;
    }


}
