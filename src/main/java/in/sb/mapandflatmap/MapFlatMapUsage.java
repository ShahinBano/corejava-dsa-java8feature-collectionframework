package in.sb.mapandflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapUsage {
    public static void main(String[] args) {
        List<Topic>topic1 = List.of(new Topic("What is java"), new Topic("History of java"));
        List<Topic>topic2 = List.of(new Topic("variable"),new Topic("Data type"));
        List<Module>module1 = List.of(new Module("Introduction",topic1));
        List<Course> courses = List.of(
                new Course("Basic Java",module1),
                new Course("Advanced Java", List.of(
                                new Module("Stream", List.of(
                                        new Topic("map()"),
                                        new Topic("flatMap()"))))),
                new Course("Python",List.of(
                        new Module("Introduction to Python",List.of(
                                new Topic("variables in python"),
                                new Topic("Data types in python")
                        ))
                ))
        );

        List<String> allTopics = courses.stream()
                .flatMap(course -> course.getModules().stream())
                .flatMap(module -> module.getTopics().stream())
                .map(topic -> topic.getName()).collect(Collectors.toList());
        System.out.println(allTopics);

    }
}