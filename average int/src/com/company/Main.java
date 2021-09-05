package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        List<Person> persons =
                Arrays.asList(
                        new Person("Munya", 21),
                        new Person("Tafadzwa", 14),
                        new Person("Kenny", 19),
                        new Person("Takunda", 7));


        Double averageAge = persons
                .stream()
                .collect(Collectors.averagingInt(p -> p.age));

        System.out.println(averageAge);
    }

}
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }
}