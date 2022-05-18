import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Metods {
    public static void main(String[] args){
        Integer MostInteger = findTheMost(List.of(46, 5, 89),
                ((integer1, integer2) -> integer1 > integer2 ? integer1 : integer2));
        String MostString = findTheMost(List.of("Fkfwpk", "fwj", "fwkel", "jvlkksggh"),
                (string1, string2) -> string1.length() > string2.length() ? string1 : string2);
        Rectangle MostRectangle = findTheMost(List.of(
                        new Rectangle(64, 89),
                        new Rectangle(83, 45),
                        new Rectangle(57, 13)
                ),
                (rectangle1, rectangle2) -> rectangle1.area() > rectangle2.area() ? rectangle1 : rectangle2);
        Horse MostHorse = findTheMost(List.of(
                        new Horse(475, 157),
                        new Horse(542, 184),
                        new Horse(531, 178)
                ),
                (horse1, horse2) -> horse1.sise() > horse2.sise() ? horse1 : horse2);
        System.out.println(MostInteger);
        System.out.println(MostString);
        System.out.println(MostRectangle);
        System.out.println(MostHorse);
    }

    public static  <E> E findTheMost(List <E> elements, FindTheMostFunction <E> function){
        E max = elements.get(0);

        for (E element : elements) {
            max = function.max(element, max);
        }
        return max;
    }

    @FunctionalInterface
    public interface FindTheMostFunction <E> {
        E max(E elem1, E elem2);
    }

    public static List <Integer> findTheMax(List<Integer> elements){
        Integer max;
        max = elements.get(0);
        for (int i = 0; i < elements.size(); i++){
            if (max < elements.get(i)){
                max = elements.get(i);
            }
        }
        return Collections.singletonList(max);
    }
}