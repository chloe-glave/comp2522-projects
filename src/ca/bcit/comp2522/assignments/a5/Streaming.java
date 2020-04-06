package ca.bcit.comp2522.assignments.a5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Demonstrates some applications of streaming in Java.
 *
 * @author Chloe Glave
 * @version 2020
 */
public class Streaming {
    /*
     * QUESTION 1
     *
     * The following stream pipeline will produce a sum of all odd Integers in the list.
     *
     * list.stream().filter(value -> value % 2 != 0).sum();
     */

    /*
     * QUESTION 2
     *
     * The following stream pipeline will run 1 million coin flips.
     * It generates a random number between 1 and 3 (so either 1 or 2) 1_000_000 times,
     * and puts the result in a collection, which stores the number of times each side was flipped.
     *
     * random.ints(1_000_000, 1, 3).boxed()
     * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
     * .forEach((side, frequency) -> System.out.printf("%-6d%d%n", side, frequency));
     */

    /**
     * Creates a List containing 30 random characters.
     *
     * @return the created List.
     */
   static List<Character> words() {

       List<Character> listToPopulate = new ArrayList<>();

       for (int j = 0; j < 30; ++j) {
           listToPopulate.add((char) (97 + new Random().nextInt(26)));
       }

       return listToPopulate;
   }

    /**
     * Sorts a List of characters in ascending order (a-z).
     *
     * @param listToSort the List of characters to sort.
     * @return the newly sorted List.
     */
   static List<Character> ascendingSort(List<Character> listToSort) {
       return listToSort.stream()
               .sorted().collect(Collectors.toList());
   }

    /**
     * Sorts a List of characters in descending order (z-a).
     *
     * @param listToSort the List of characters to sort.
     * @return the newly sorted List.
     */
    static List<Character> descendingSort(List<Character> listToSort) {
        return listToSort.stream()
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    /**
     * Sorts a List of characters in descending order (z-a), removing any duplicate letters.
     *
     * @param listToSort the List of characters to sort.
     * @return the newly sorted List.
     */
    static List<Character> descendingSortNoDuplicates(List<Character> listToSort) {
        return listToSort.stream()
                .distinct() // removes duplicates
                .sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    /**
     * Demonstrates "lazy filtering" in Streams.
     * Prints out every word in a List with more than 10 letters.
     *
     * @param words the List to print from.
     */
    static void lazyStream(List<String> words) {
        words.stream()
                .filter(e -> e.length() > 10)
                // filtering only happens when the result is needed
                .peek(event -> System.out.println("Something was filtered!"))
                .forEach(e -> System.out.println(e));
    }

    public static void main(String[] args) { // todo: clean up main

//        al.stream().forEach(e -> System.out.println(e));

   //     al.stream().filter(value -> value % 2 != 0).forEach(value -> System.out.println(value));

//        new Random().ints(1_000_000, 1, 3).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) .forEach((side, frequency) -> System.out.printf("%-6d%d%n", side, frequency));

        List<Character> letters = words();
        System.out.println("Generated letters array: " + letters);

        List<Character> ascendingSortedLetters = ascendingSort(letters);
        System.out.println("Ascending sorted array: " + ascendingSortedLetters);

        List<Character> descendingSortedLetters = descendingSort(letters);
        System.out.println("Descending sorted array: " + descendingSortedLetters);

        List<Character> descendingSortedUniqueLetters = descendingSortNoDuplicates(letters);
        System.out.println("Descending sorted array with no duplicates: "
                            + descendingSortedUniqueLetters);

        ArrayList<String> words = new ArrayList<>(List.of(
                        "fine", "periodical", "plain", "colour", "unknown", "wealthy", "spade",
                        "sturdy", "representative", "float", "lumber", "concatenation",
                        "wanting", "support", "wilderness", "brake", "delicious", "industrious"));

        lazyStream(words);


    }
}
