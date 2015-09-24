package playground;

public class ArrayQueue<T> {
    private int start;
    private int nextEnd;
    private int size;
    private int capacity;
    private T[] arr;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        arr = (T[])new Object[capacity];
    }

    public void enqueue(T item) throws Exception {
        if (start == nextEnd && size > 0) {
            throw new Exception("Queue is full");
        }

        arr[nextEnd] = item;
        nextEnd++;

        if (nextEnd == capacity) {
            nextEnd = 0;
        }
        size++;
    }

    public T dequeue() throws Exception {
        if (size == 0) {
            throw new Exception("Queue is empty");
        }

        T ret = arr[start];
        start++;

        if (start == capacity) {
            start = 0;
        }

        size--;
        return ret;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }
}
