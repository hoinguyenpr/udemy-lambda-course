package exercises;

import java.util.Arrays;
import java.util.List;


/*
* Print Courses Whose Name has at least 4 letters
* */
public class Exercise4 {

    public static void main(String[] args) {

        List<String> courses = Arrays.asList("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure", "Docker", "Kubernetes");

        printCoursesAtLeast4Character(courses);

    }

    public static void printCoursesAtLeast4Character(List<String> courses){

        courses.stream()
                .filter(s -> s.length() > 4 || s.length() == 4)
                .forEach(System.out::println);

    }

}
