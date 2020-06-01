package Exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Exercise2 implements Exercise {
    @Override
    public void start() {
        System.out.println("Exercise 2:\n");
        var integerCollection = new ArrayList<Integer>(Arrays.asList(-1, 0, 1));
        integerCollection.add(2);

        List<Integer> collectionCopy = List.copyOf(integerCollection);
        Stream<Integer> positiveElements = collectionCopy.stream().filter(x -> x > 0);
        System.out.println("All positive numbers:\n");
        positiveElements.forEach(System.out::println);

        try {
            collectionCopy.add(7);
        }
        catch (UnsupportedOperationException e){
            System.out.println("Could not add value to unmodifiable list");
        }
    }
}
