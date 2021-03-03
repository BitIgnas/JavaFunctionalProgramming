package FunctionalProgramming.Example1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        /**
         * Imperative programming approach (for standard approach)
         */

        List<Person> people = Arrays.asList(
                new Person("Tom", Gender.MALE),
                new Person("Jane", Gender.FEMALE),
                new Person("Mary", Gender.FEMALE),
                new Person("Lucy", Gender.FEMALE),
                new Person("Jack", Gender.MALE),
                new Person("John", Gender.MALE)
        );

        /**
         * In imperative (standartinis) programming we define every single detail in order to achieve result
         * Eg. Define list, define list for filtered products, iterate through list, and found items to
         * filtered list and finally print out the list
         */

        List<Person> females = new ArrayList<Person>();
        for (Person person : people) {
            if(Gender.FEMALE.equals(person.getGender())){
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        females.forEach(System.out::println);

        System.out.println("********Declarative approach*********");
        /**
         * Declarative programming or functional style programming
         */

        List<Person> females2 = people.stream()
                .filter(person -> Gender.FEMALE.equals(person.getGender()))
                .collect(Collectors.toList());

        females2.forEach(System.out::println);

        /**
         * Optimized way
         */

        System.out.println("DECLARATIVE APPROACH TO FIND MALES");
        Predicate<Person> personPredicate = person -> Gender.MALE.equals(person.getGender());
        people.stream()
                .filter(personPredicate)
                .forEach(System.out::println);

        people.stream().filter(person -> Gender.FEMALE.equals(person.getGender())).forEach(s -> System.out.println(s));

        System.out.println("Using function functional interface");
        Function<Person, String> personNameToUpperCase = person -> person.getName().toUpperCase();
        //using variables as argument defining PREDICATE  and FUNCTION
        people.stream().map(personNameToUpperCase).forEach(System.out::println);
        //Using inline variables with expressions defining PREDICATE AND FUNCTION
        people.stream()
                .filter(person -> Gender.MALE.equals(person.getGender()))
                .map(person -> person.getName().toUpperCase())
                .collect(Collectors.toList());

    }
}
