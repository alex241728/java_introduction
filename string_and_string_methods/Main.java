package string_and_string_methods;

public class Main {
    public static void main(String[] args) {
        String sentence = "aBc";
        System.out.println(sentence);

        // length
        System.out.println("Length is " + sentence.length());

        // upper and lower case
        System.out.println(sentence.toUpperCase());
        System.out.println(sentence.toLowerCase());

        // indexOf
        System.out.println(sentence.indexOf('B'));

        // replace
        System.out.println(sentence.replace("a", "ccc"));

        // isEmpty
        System.out.println(sentence.isEmpty());

        // contains
        System.out.println(sentence.contains("c"));

        // charAt
        System.out.println(sentence.charAt(0));

        // substring
        System.out.println(sentence.substring(1));
    }
}
