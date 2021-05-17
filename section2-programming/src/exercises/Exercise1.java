package exercises;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
/*
* Print Only Odd Numbers from the List
* */
public class Exercise1 {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(9,10,100,5,2,11,78,10,3);

        printOddNumber(number);

    }

    public static void printOddNumber(@NotNull List<Integer> numbers){

        numbers.stream()
                .filter(integer -> integer % 2 != 0)
                .forEach(System.out::println);

    }
}
