package programming;

import java.util.Arrays;
import java.util.List;

/*
* Structured we had to focus on how to loop the numbers and then print them
* */
public class FP01Structured {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,9,5,10,3,11,4,1,11,22);

        printAlNumbersInListStructured(numbers);

        System.out.println("--------------------------------");

        printEventNumberInListStructured(numbers);
    }

    private static void printAlNumbersInListStructured(List<Integer> asList) {
        //How to loop the number?
        for(int number : asList){
            System.out.println(number);
        }
    }

    private static void printEventNumberInListStructured(List<Integer> asList){
        for(int number : asList){
            if(number % 2 == 0){
                System.out.println(number);
            }
        }
    }


}
