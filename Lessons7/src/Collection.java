import java.util.Iterator;
import java.util.List;

public interface Collection{
    Object[] collection = new Object[0];
    int size = 0;
    int capacity = 10;

    default int size() {
        return size;
    }
    //Количество элементов в коллекции.
    default boolean isEmpty() {
        if (size == 0) {
            return true;
        }else {
            return false;
        }
    }
    //Проверка коллекции на пустоту (отсутствие элементов коллекции).

    default boolean contains(Object item){
        boolean found= false;7
        int i=0;
        while ((!found) & (i < size)) {
            if (collection[i] == item){
                found = true;
            }
            i++;
        }
        return found;
    }
    //Проверка на наличие элемента item в коллекции.

    static boolean add(Object item){

        return true;
    }
    //Вставка элемента item в конец коллекции.

    static boolean remove(Object item) {
        boolean delete = false;
        for (int i = 0; i < size; i++) {

        }
        return delete;
        }

    }
    //Удаление элемента item из коллекции.
    //Если элемент встречается несколько раз, то будут удалены всех вхождения элемента в коллекцию.
    //Возвращается признак удаления хотя бы одного элемента из коллекции.

    static void clear(){

    }
    //Удаление всех элементов коллекции.




}
