package list;

import java.util.Arrays;

public class StringList {
    private static final int DEFAULT_CAPACITY = 10;
    private String[] data;
    private int size;
    
    public StringList() {
        this.data = new String[DEFAULT_CAPACITY];
        this.size = 0;
    }
    
    private void ensureCapacity() {
        int newSize = data.length * 2;
        data = Arrays.copyOf(data, newSize);
    }
    
    public int size() {
        return size;
    }
    
    public boolean add(String element) {
        if (size == data.length) {
            ensureCapacity();
        }
        data[size++] = element;
        return true;
    }
    
    public String get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return data[i];
    }
}
