import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestArea {
    public static void main(String[] args){
        List<Rectangle> rectangles = Arrays.asList(
                new Rectangle(9, 7),
                new Rectangle(7, 4),
                new Rectangle(64, 93),
                new Rectangle(97, 48)
        );

        System.out.println(rectangles);

        List <Rectangle> maxarea = filterByTheLargestArea(rectangles);

        System.out.println(maxarea);
    }

    public static List<Rectangle> filterByTheLargestArea(List<Rectangle> rectangles){
        Rectangle maxRec;
        maxRec = rectangles.get(1);
        for (int i = 0; i < rectangles.size(); i++) {
            if (maxRec.area() < rectangles.get(i).area()){
                maxRec = rectangles.get(i);
            }
        }
        return Collections.singletonList(maxRec);
    }
}