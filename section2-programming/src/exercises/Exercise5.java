package exercises;

import java.util.Arrays;
import java.util.List;

/*
*
* Print the cubes of odd numbers
* */

public class Exercise5 {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(9,10,100,5,2,11,78,10,3);

        printCubesOddNumber(number);

    }

    public static void printCubesOddNumber(List<Integer> numbers){

        numbers.stream()
                .filter(integer -> integer % 2  != 0) // return integer if expression true
                .map(integer -> integer * integer * integer) // return the value of function
                .forEach(System.out::println);

    }
}
