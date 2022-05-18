import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxNumber {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(6);
        numbers.add(-7764);
        numbers.add(6781);

        System.out.println(numbers);

        List <Integer> maxNumber = filterByMaxNumber(numbers);

        System.out.println(maxNumber);
    }

    public static List<Integer> filterByMaxNumber(List<Integer> numbers){
        Integer max;
        max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++){
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return Collections.singletonList(max);
    }
}