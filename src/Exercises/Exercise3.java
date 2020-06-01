package Exercises;

import java.util.stream.Stream;

public class Exercise3 implements Exercise {
    @Override
    public void start() {
        System.out.println("Exercise 3:\n");

        //Blank/empty
        String space = " ";
        System.out.println("String with space only:");
        System.out.format("Is Blank: %s\n", space.isBlank());
        System.out.format("Is Empty: %s\n", space.isEmpty());

        //Lines
        System.out.println(".lines method:");
        String multipleLinesText = "AB\nAB\nAB";
        Stream<String> lines = multipleLinesText.lines();
        lines.forEach(System.out::println);

        String db = " DB ";

        System.out.println(".strip");
        System.out.println(db.strip());

        System.out.println(".stripLeading");
        System.out.println(db.stripLeading());

        System.out.println(".stripTrailing");
        System.out.println(db.stripTrailing());

        System.out.println(".repeat");
        System.out.println("==".repeat(5));
    }
}
