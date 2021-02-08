package javamaven;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PoemToList {
    private static final String poem = "There is one mind in all of us, one soul,\n" +
            "who parches the soil in some nations\n"+
            "but in others hides perpetually behind a veil;\n" +
            "he spills light everywhere, here he spilled\n" +
            "some on my tie, but it dried before dinner ended.\n" +
            "He is in charge of darkness also, also\n" +
            "in charge of crime, in charge of the imagination.\n" +
            "People fucking do so by flicking him\n" +
            "off and on, off and on, with their eyelids\n" +
            "as they ascertain their love's sincerity.\n" +
            "He makes the stars disappear, but he makes\n" +
            "small stars everywhere, on the hoods of cars,\n" +
            "in the ommatea of skyscrapers or in the eyes\n" +
            "of sighing lovers bored with one another.\n" +
            "Onto the surface of the world he stamps\n" +
            "all plants and animals. They are not gods\n" +
            "but it is he who made us worshippers of every\n" +
            "bramble toad, black chive we find.\n" +
            "In Idaho there is a desert cricket that makes\n" +
            "a clock-like tick-tick when he flies, but he\n" +
            "is not a god. The only god is the sun,\n" +
            "our mind, master of all crickets and clocks.";

    private static final Comparator<String> lineLengthComparator = new Comparator<String>(){
        @Override
        public int compare(String o1, String o2) {
            return o1.length()- o2.length();
        }
    };

    public static void main(String[] args) {
        //sorting the lines of poem in ascending

        List<String> listOfPoem = Arrays.asList(poem.split("\n"));
        for (int i = 0; i < listOfPoem.size(); i++) {
            System.out.println(listOfPoem.get(i));
        }

        System.out.println("\n" + "Sorting the lines of poem in ascending" + "\n");

        Collections.sort(listOfPoem, lineLengthComparator);
        for (int i = 0; i < listOfPoem.size(); i++){
            System.out.println(listOfPoem.get(i));
        }
    }
}
