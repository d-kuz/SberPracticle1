import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MetodsTest {
    @Test
    public void TestMaxNumber1(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(9);
        numbers.add(782);
        numbers.add(64);


        List <Integer> maxnumber = MaxNumber.filterByMaxNumber(numbers);

        List<Integer> test = new ArrayList<>();
        test.add(782);
        Assertions.assertEquals(test, maxnumber);
    }

    @Test
    public void TestMaxNumber2(){
        Integer theMostInteger = Metods.findTheMost(List.of(50, 1, 100),
                ((integer1, integer2) -> integer1 > integer2 ? integer1 : integer2));

        Assertions.assertEquals(100, theMostInteger);
    }

    @Test
    public void TestLongestString1(){
        List<String> strings = new ArrayList<>();
        strings.add("jlserdftvghb");
        strings.add("zxcvbnu");
        strings.add("ertyui");

        List <String> maxstring = LongestString.filterByTheLongestString(strings);
        List<String> test = new ArrayList<>();
        test.add("jlserdftvghb");
        Assertions.assertEquals(test, maxstring);
    }

    @Test
    public void TestLongestString2(){
        String theMostString = Metods.findTheMost(List.of("fda", "eqrg", "xcvbnmyr", "wdsef"),
                (string1, string2) -> string1.length() > string2.length() ? string1 : string2);

        Assertions.assertEquals("xcvbnmyr", theMostString);
    }

    @Test
    public void TestTheLargestArea1(){
        List<Rectangle> rectangles = Arrays.asList(
                new Rectangle(9, 7),
                new Rectangle(7, 4),
                new Rectangle(64, 93),
                new Rectangle(97, 134)
        );

        List <Rectangle> maxarea = LargestArea.filterByTheLargestArea(rectangles);

        List<Rectangle> test = Arrays.asList(
                new Rectangle(97, 134));
        Assertions.assertEquals(test, maxarea);
    }

    @Test
    public void TestTheLargestArea_2(){
        Rectangle theMostRectangle = Metods.findTheMost(List.of(
                        new Rectangle(41, 12344),
                        new Rectangle(64, 93),
                        new Rectangle(97, 134)
                ),
                (rectangle1, rectangle2) -> rectangle1.area() > rectangle2.area() ? rectangle1 : rectangle2);

        Rectangle test = new Rectangle(41, 12344);
        Assertions.assertEquals(test, theMostRectangle);
    }

    @Test
    public void TestMaxHorse(){
        Horse horse = new Horse(583, 193);
        List<Horse> horses = Arrays.asList(
                new Horse(475, 157),
                new Horse(542, 184),
                horse,
                new Horse(531, 178)
        );

        List <Horse> MostHorse = MaxHorseSize.filterByMaxHorseSize(horses);
        List<Horse> horsesTest = Arrays.asList(
                horse);
        Assertions.assertEquals(horsesTest, MostHorse);
    }

    @Test
    public void TestMaxHorse2(){
        Horse horse = new Horse(583, 193);
        Horse horses = Metods.findTheMost(List.of(
                        new Horse(475, 157),
                        new Horse(542, 184),
                        horse,
                        new Horse(531, 178)
                ),
                (horse1, horse2) -> horse1.sise() > horse2.sise() ? horse1 : horse2);

        Assertions.assertEquals(horse, horses);
    }

}

