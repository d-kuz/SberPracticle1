import java.util.Collection;
import java.util.Iterator;

public class ArrayList implements List{
    private Object[] arr;
    private int size;
    private int capacity;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean contains(Object item) {
        boolean found= false;
        int i=0;
        while ((!found) & (i < size)) {
            if (arr[i] == item){
                found = true;
            }
            i++;
        }
        return found;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object item) {
        if (size >= capacity) {
            capacity = (capacity * 3) / 2 + 1;
            Object[] newCollection = new Object[capacity];
            for (int i = 0; i < arr.length; i++) {
                newCollection[i] = arr[i];
            }
            arr = newCollection;
        }
        arr[size] = item;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
