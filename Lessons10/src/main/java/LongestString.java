import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LongestString {
    public static void main(String[] args){
        List<String> strings = new ArrayList<>();
        strings.add("Birds flying high");
        strings.add("Sun in the sky");
        strings.add("Reeds drifting on by");

        System.out.println(strings);

        List <String> maxstring = filterByTheLongestString(strings);

        System.out.println(maxstring);
    }

    public static List<String> filterByTheLongestString(List<String> strings){
        String max = "";
        for (int i = 0; i < strings.size(); i++){
            if (max.length() < strings.get(i).length()){
                max = strings.get(i);
            }
        }
        return Collections.singletonList(max);
    }
}
