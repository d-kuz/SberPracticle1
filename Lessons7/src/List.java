import java.util.Collection;

public interface List extends Collection {


    static void add(int index, Object item){

    }
    //Вставка элемента item на позицию index.
    //В результате вставки список раздвигается, т.е. все элементы, начиная с позиции index, увеличивают свой индекс
    // на 1, т.е. сдвигаются на один элемент вправо.

    static void set(int index, Object item){

    }
    //Замена элемента, находящегося на позиции index объектом item.
    //Если index указывает на адрес первой свободной позиции (позиции, находящейся сразу за последним элементом),
    // то будет произведена вставка элемента в конец списка.

    static Object get(int index){

        return null;
    }
    //Получение объекта, находящегося на позиции index.
    //В случае отсутствия в коллекции элемента на позиции index генерируется исключение IndexOutOfBoundsException.

    static int indexOf(Object item){

        return 0;
    }
    //Получение индекса последнего появления элемента item в списке, либо -1 в случае отсутствия элемента в списке.

    static int lastIndexOf(Object item){

        return 0;
    }
    //Получение индекса последнего появления элемента item в списке, либо -1 в случае отсутствия элемента в списке.

    static Object remove(int index){

        return null;
    }
    //Удаление элемента, находящегося на позиции index.
    //Возвращается удаленный элемент.
    //В случае отсутствия элементов в коллекции генерируется исключение IndexOutOfBoundsException.

    static List subList(int from, int to){

        return null;
    }
    //Получение нового списка, представляющего собой часть данного, начиная с позиции from включительно до позиции
    // to не включительно, т.е. интервал элементов: [from, to - 1]. В случае выхода за границы списка генерируется
    // исключение IndexOutOfBoundsException.

}
