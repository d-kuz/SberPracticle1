public class ArrayList implements List{
    int size;
    int capacity = 10;
    Object[] arr = new Object[capacity];


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
    public boolean add(Object item) {
        if (size >= capacity){
            capacity = (capacity*3)/2 + 1;

            Object[] newArr = new Object[capacity];

            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[size] = item;
        size++;
        return false;
    }

    @Override
    public boolean remove(Object item) {
        boolean isDelete = false;
        int i=0;
        while ((!isDelete) & (i < size)){
            if (arr[i] == item) {
                for (int j = i; j < size; j++) {
                    arr[j] = arr[j+1];
                }
                size--;
                arr[size] = null;
                isDelete = true;
            }
        }
        return isDelete;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }

    @Override
    public void add(int index, Object item) {
        if (size >= capacity){
            capacity = (capacity*3)/2 + 1;

            Object[] newArr = new Object[capacity];

            for(int i = 0; i < arr.length; i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[index] = item;
        size++;
        Object y;
        for(int i = index + 1; i < size - 1; i++){
            y = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = y;
        }
    }

    @Override
    public void set(int index, Object item) {
        if (index == size){
            add(item);
        } else {
            arr[index] = item;
        }
    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException{
        if ((!isEmpty()) & (arr[index] != null) & (index < size)){
            return arr[index];
        }
        return null;
    }

    @Override
    public int indexOf(Object item) {
        int j = -1;
        boolean isFirst = false;
        for (int i = 0; i < size; i++){
            if ((arr[i] == item) & (!isFirst)){
                j = i;
                isFirst = true;
            }
        }
        return j;
    }

    @Override
    public int lastIndexOf(Object item) {
        int j = -1;
        for (int i = size - 1; i > 0; i--){
            if (arr[i] == item){
                j = i;
            }
        }
        return j;
    }

    @Override
    public Object remove(int index) throws IndexOutOfBoundsException{
        Object copyA;
        if (arr[index] != null){
            copyA = arr[index];
            for (int j = index; j < size; j++) {
                arr[j] = arr[j+1];
            }
            size--;
            arr[size] = null;
            return copyA;
        }
        return null;
    }

    @Override
    public Object[] subList(int from, int to) throws IndexOutOfBoundsException{
        if (size <= capacity){
            Object[] newArr = new Object[to-from];

            for(int i = from; i < to; i++){
                newArr[i] = arr[i];
            }
            return newArr;
        }
        return null;
    }
}

