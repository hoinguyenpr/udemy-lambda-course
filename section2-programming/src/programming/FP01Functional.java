package programming;

import java.util.Arrays;
import java.util.List;

/*
* The Functional approach, we had to get a list of elements and we define what to do with each one of them
* With Functional approach, you just focusing on the "What to do"?. .foreach() element what to check?
* */
public class FP01Functional {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,9,5,10,3,11,4,1,11,22);

        System.out.println("-----------All--------------");

        printAllNumbersInListFunctional(numbers);

        System.out.println("------------Even-------------");

        printEvenNumbersInListFunctional(numbers);

        System.out.println("-------------Odd------------");

        printOddNumbersInListFunctional(numbers);
    }



    public static void printNumber(int number){
        System.out.println(number);
    }

    private static boolean isEven(int number){
        return number % 2 == 0;
    }

    private static void printAllNumbersInListFunctional(List<Integer> asList) {
        //Convert a list into a stream
        asList.stream()
//              .forEach(FP01Functional::printNumber)
                .forEach(System.out::println);//Method Reference
    }

    /*
    * Lambdas Expression
    * EX: integer -> integer % 2 == 0
    * */

    private static void printEvenNumbersInListFunctional(List<Integer> asList){
        asList.stream()
                //.filter(FP01Functional::isEven)
                .filter(integer -> integer % 2 == 0)//Filter - Only Allow Even Numbers
                .forEach(System.out::println);// Method Reference

    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(integer -> integer % 2 != 0) // Meaning: if expression true, return that Integer.
                .forEach(System.out::println);
    }

}
