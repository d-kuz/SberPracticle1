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
        Node next = node.next;
        while (next != null){
            if(node.item.equals(item)){
                node.next = next.next;
                next.next.prev = next.prev;
                next = null;
                return true;
            }
            node = next;
            next = next.next;
        }
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public void add(int index, Object item) {

    }

    @Override
    public void set(int index, Object item) {

    }

    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        return null;
    }

    @Override
    public int indexOf(Object item) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object item) {
        return 0;
    }

    @Override
    public Object remove(int index) throws IndexOutOfBoundsException{
        return null;
    }

    @Override
    public Object[] subList(int from, int to) throws IndexOutOfBoundsException{
        return null;
    }

    @Override
    public void addFirst(Object item) {

    }

    @Override
    public void addLast(Object item) {

    }

    @Override
    public Object getFirst() throws NoSuchElementException{
        return null;
    }

    @Override
    public Object getLast() throws NoSuchElementException{
        return null;
    }

    @Override
    public Object pollFirst() {
        return null;
    }

    @Override
    public Object pollLast() {
        return null;
    }

    @Override
    public Object removeFirst() throws NoSuchElementException{
        return null;
    }

    @Override
    public Object removeLast() throws NoSuchElementException {
        return null;
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
