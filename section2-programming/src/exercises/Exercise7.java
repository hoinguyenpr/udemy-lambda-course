package exercises;

import java.util.Arrays;
import java.util.List;

/*Square every number in a list and find the sum of squares*/
public class Exercise7 {

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(9,10,100,5,2,11,78,10,3);

        printSquareNumberAndSumOfSquare(number);

    }

    public static void printSquareNumberAndSumOfSquare(List<Integer> numbers){

        numbers.stream()
                .map(integer -> integer * integer)
                .forEach(System.out::println);

    }
}
