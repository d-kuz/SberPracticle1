import java.util.NoSuchElementException;

public class LinkedList implements List, Deque {
    int size;
    Node first;
    Node last;

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
        Node node = first;

        while (node != null){
            if(node.item.equals(item)){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public boolean add(Object item) {
        Node node = new Node();
        node.item = item;
        if (first == null){
            first = node;
        }else {
            last.next = node;
            node.prev = last;
        }
        last = node;
        size++;

        return true;
    }

    @Override
    public boolean remove(Object item) {
        Node node = first;
        if(node.item.equals(item)){
            first = null;
            return true;
        }
        while (node != null){
            if(node.item.equals(item)){
                node.prev.next = node.next.next;
                node.next.prev = node.prev.prev;
                node = null;
                return true;
            }
            node = node.next;
        }
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void add(int index, Object item) {
        Node node = first;
        Node newNode = new Node();
        newNode.item = item;
        int i=0;
        while (node != null){
            if (i==index){
                node.next = newNode;
                node.prev = last;
                size++;
            }
            i++;
            node = node.next;
        }
    }

    @Override
    public void set(int index, Object item) {
        Node node = first;
        int i=0;
        if (index == size){
            addLast(item);
        }else{
            while(i<index){
                i++;
                node = node.next;
            }
            node.item = item;
        }

    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.item;
    }

    @Override
    public int indexOf(Object item) {
        Node node = first;
        int i=0;
        while((i<size) & (node.item != item)){
            i++;
            node = node.next;
        }
        return size-i;
    }

    @Override
    public int lastIndexOf(Object item) {
        Node node = last;
        int i=size-1;
        while((i>0) & (node.item != item)){
            i--;
            node = node.next;
        }
        return i;
    }

    @Override
    public Object remove(int index) throws IndexOutOfBoundsException{
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        Object d = node.item;
        node.prev.next = node.next.next;
        node.next.prev = node.prev.prev;
        node = null;
        return d;
    }

    @Override
    public Object[] subList(int from, int to) throws IndexOutOfBoundsException{
        Node node = first;
        for (int i = 0; i < from; i++) {
            node = node.next;
        }
        Object[] arr = new Object[to-from];
        for (int i = from; i < to; i++) {
            arr[i-from] = node.item;
        }
        return arr;
    }

    @Override
    public void addFirst(Object item) {
        Node node = new Node();
        node.item = first.item;
        Object d;
        d = item;
        node.next = first.next;
        node.prev = first;
        first.next.prev = node;
        first.next = node;
        first.item = d;
    }

    @Override
    public void addLast(Object item) {
        Node node = new Node();
        node.item = last.item;
        Object d;
        d = item;
        node.next = last;
        node.prev = last.prev;
        last.prev.next = node;
        last.prev = node;
        first.item = d;
    }

    @Override
    public Object getFirst() throws NoSuchElementException{
        return first.item;
    }

    @Override
    public Object getLast() throws NoSuchElementException{
        return last.item;
    }

    @Override
    public Object pollFirst() {
        if (first == null){
            return null;
        }else {
            Object n = first.item;
            first.next.prev = null;
            first = first.next;
            return n;
        }
    }

    @Override
    public Object pollLast() {
        if (first == null){
            return null;
        }else {
            Object n = last.item;
            last.prev.next = null;
            last = last.prev;
            return n;
        }
    }

    @Override
    public Object removeFirst() throws NoSuchElementException{
        Object n = first.item;
        first.next.prev = null;
        first = first.next;
        return n;
    }

    @Override
    public Object removeLast() throws NoSuchElementException {
        Object n = last.item;
        last.prev.next = null;
        last = last.prev;
        return n;
    }


    class Node {
        Object item;
        Node next;
        Node prev;
    }

    public String toString(){
        StringBuilder res = new StringBuilder();
        Node node = first;
        while (node != null){
            res.append(node.item);
            node = node.next;
        }
        return res.toString();
    }
}
