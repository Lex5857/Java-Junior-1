package javaJunior.Lesson1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 20, 8, 0, 5);
        System.out.println(averageEventNums(numbers));
    }

    public static long averageEventNums(List<Integer> numbers){
        List<Integer> eventNums = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        long sum = eventNums.stream().mapToInt(Integer::intValue).sum();
        long count = eventNums.stream().mapToInt(Integer::intValue).count();
        return sum / count;
    }
}
