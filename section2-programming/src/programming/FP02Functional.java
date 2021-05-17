package programming;

import java.util.Arrays;
import java.util.List;

/*
* The Functional approach, we had to get a list of elements and we define what to do with each one of them
* With Functional approach, you just focusing on the "What to do"?. .foreach() element what to check?
* */
public class FP02Functional {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,9,5,10,3,11,4,1,11,22);

        int sum = addListStructured(numbers);

        System.out.println(sum);

    }

    private static int sum(int a, int b){
        return  a + b;
    }

    private static int addListStructured(List<Integer> numbers) {
        //Stream of number -> One result value
        //Combine them into one result => One value
        //0 and FP02Functional::sum
        return numbers.stream()
                .reduce(0, FP02Functional::sum);
    }


}
