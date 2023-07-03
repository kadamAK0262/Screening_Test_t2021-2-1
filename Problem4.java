package com.problem4;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem4 {
	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        List<Integer> multiples = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Map<Object, Object> countMap = multiples.stream()
                .collect(Collectors.toMap(
                        multiple -> multiple,
                        multiple -> numbers.stream().filter(number -> number % multiple == 0).count()
                ));

        System.out.print("{ ");
        countMap.forEach((multiple, count) -> System.out.print(multiple + ":" + count+ " , "));
        System.out.print("}");
    }
}
