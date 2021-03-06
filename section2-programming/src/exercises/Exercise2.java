package exercises;

import java.util.Arrays;
import java.util.List;

/*
* Print All Courses individually
* List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes")
*
* */
public class Exercise2 {
    public static void main(String[] args) {

        List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

        printAllCourses(courses);

    }

    public static void printAllCourses(List<String> courses){

        courses.stream()
                .forEach(System.out::println);

    }

}
