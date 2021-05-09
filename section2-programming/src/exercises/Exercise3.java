package exercises;

import java.util.Arrays;
import java.util.List;

/*
* Print Courses Containing the word "Spring"
* */
public class Exercise3 {
    public static void main(String[] args) {

        List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

        printAllCourses(courses);

    }

    public static void printAllCourses(List<String> courses){

        courses.stream()
                .filter(s -> s.contains("Spring"))
                .forEach(System.out::println);

    }
}
