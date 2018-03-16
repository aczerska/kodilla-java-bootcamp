package com.kodilla.stream.array;

import java.util.NoSuchElementException;
import java.util.stream.IntStream;
import java.lang.*;

public interface ArrayOperations {

    static double getAverage(int[] numbers) {
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);
        return IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average()
                .orElseThrow(()-> new NoSuchElementException());
    }
}
