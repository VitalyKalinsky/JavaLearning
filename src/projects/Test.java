package projects;

import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {

        IntStream.iterate(50, x -> x - 1)
                .limit(50)
                .sorted()
                .forEach(x -> System.out.print(x + " "));
    }
}