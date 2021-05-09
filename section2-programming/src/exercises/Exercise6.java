package exercises;

import java.util.Arrays;
import java.util.List;


/*Print the number of characters in each course name*/
public class Exercise6 {

    public static void main(String[] args) {

        List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

        printAllCoursesWithNumberOfCharacter(courses);

    }

    public static void printAllCoursesWithNumberOfCharacter(List<String> courses){

        courses.stream()
                .map(s -> s + " " + s.length())
                .forEach(System.out::println);

    }

}
