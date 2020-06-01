package Exercises.Exercise1;

import java.util.List;
import java.util.Optional;

public interface IntegerManager{
    private List<Integer> getValues() {
        return List.of(-3, -2, -1, 0, 1);
    }

    default void printFirstPositiveNumber(){
        Optional<Integer> firstPositive = getValues().stream().filter(x -> x > 0).findFirst();
        if (firstPositive.isPresent()){
            System.out.println("First positive number:");
            System.out.println(firstPositive.get());
        }
        else{
            System.out.println("Positive number not found");
        }
    }
}