import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ArrayListTest{
    @Test
    public void TestArrayListSizeZero(){
        ArrayList arrayList = new ArrayList();
        int size = arrayList.size();
        Assertions.assertEquals(0, size);
    }

    @Test
    public void TestArrayListIsEmpty(){
        ArrayList arrayList = new ArrayList();
        boolean empty = arrayList.isEmpty();
        Assertions.assertTrue(empty);
    }

    @Test
    public void TestArrayListContains(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(5);
        boolean found = arrayList.contains(5);
        Assertions.assertTrue(found);
    }

    @Test
    public void TestArrayListListAdd(){
        ArrayList arrayList = new ArrayList();
        boolean empty = arrayList.isEmpty();
        Assertions.assertTrue(empty);
    }

    @Test
    public void TestArrayListRemove(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("5");
        arrayList.add("7");
        Object a = arrayList.remove(0);
        arrayList.remove("7");
        boolean empty = arrayList.isEmpty();
        Assertions.assertTrue(empty);
        Assertions.assertEquals("5", a);
    }

    @Test
    public void TestArrayListClear(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(561);
        arrayList.clear();
        boolean empty = arrayList.isEmpty();
        Assertions.assertTrue(empty);
    }

    @Test
    public void TestArrayListSet(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(0,513);
        arrayList.set(0, 5);
        Integer c = (Integer) arrayList.get(0);
        Assertions.assertEquals(5, c);
    }

    @Test
    public void TestArrayListGet(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(561);
        Integer c = (Integer) arrayList.get(0);
        Assertions.assertEquals(561, c);
    }




}
