package programming;

import java.util.Arrays;
import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(12,9,5,10,3,11,4,1,11,22);

        int sum = addListStructured(numbers);

        System.out.println(sum);
    }

    private static int addListStructured(List<Integer> numbers) {
        //how to loop?
        //how to store the sum?
        int sum = 0;
        for(int number: numbers){
            sum += number;
        }

        return sum;
    }
}
