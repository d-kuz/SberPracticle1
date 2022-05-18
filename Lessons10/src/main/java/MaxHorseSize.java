import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxHorseSize {

    public static void main(String[] args){
        List<Horse> horses = Arrays.asList(
                new Horse(475, 157),
                new Horse(542, 184),
                new Horse(583, 193),
                new Horse(531, 178)
        );

        System.out.println(horses);

        String maxString = String.valueOf(filterByMaxHorseSize(horses));

        System.out.println(maxString);
    }

    public static List<Horse> filterByMaxHorseSize(List<Horse> horses){
        Horse maxRec;
        maxRec = horses.get(1);
        for (int i = 0; i < horses.size(); i++) {
            if (maxRec.sise() < horses.get(i).sise()){
                maxRec = horses.get(i);
            }
        }
        return Collections.singletonList(maxRec);
    }
}
