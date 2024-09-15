package java_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        /* Array */
        String[] questions = new String[2];
        questions[0] = "How many States does the USA have?";
        questions[1] = "Capital of UK?";

        /* ArrayList */
        List<String> questionList = new ArrayList<>();
        questionList.add("What Language is spoken in Germany?");
        questionList.add("What is the Capital of Canada?");
        questionList.add("In what Hemisphere is Brazil?");

        questionList.remove(1);
        
        System.out.println(questionList.size());
        System.out.println(questionList.get(0));
        
        // Wrapper Classes we can use instead of the primitive data types
        List<Integer> numbers = new ArrayList<>();
        numbers.add(420);
        numbers.add(42);

        /* Map */
        Map<String, String> countryToCapital = new HashMap<>();
        countryToCapital.put("Germany", "Berlin");
        countryToCapital.put("France", "Paris");
        countryToCapital.put("Italy", "Rome");
        countryToCapital.put("USA", "Washington DC");

        System.out.println(countryToCapital.get("Germany"));

        System.out.println("Contains Key 'Germany'? " + countryToCapital.containsKey("Germany"));
        System.out.println("Contains Value 'London'? " + countryToCapital.containsValue("London"));

        System.out.println(countryToCapital.remove("France"));

        /* Set */
        Set<String> usernames = new HashSet<>();

        usernames.add("Kaupenjoe");
        usernames.add("Nanoattack");

        System.out.println(usernames.add("FRV"));
        System.out.println(usernames.add("FRV"));


        // ERRORS YOU MIGHT RUN INTO
        // Uncomment for errors

        // IndexOutOfBoundException
        // If you try and pass in an Index that does not exist for a list
        // System.out.println(questionList.get(2));

        // Not an Exception, BUT "null"
        // If you pass in a Key into a Map that does not exist
        // Your return value is going to be null (might lead to other errors down the line!)
        // System.out.println(countryToCapital.get("Malta"));
    }
}
