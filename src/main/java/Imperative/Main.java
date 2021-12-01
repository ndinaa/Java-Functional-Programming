package Imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static Imperative.Main.Gender.*;


public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person( "ndina", MALE),
                new Person( "Maria", FEMALE),
                new Person( "Suzan", FEMALE),
                new Person( "Duncan", MALE)
        );

        //Imperative approach
        System.out.println("***********imperative Approach*******************");
        List<Person> females = new ArrayList<>();
        for (Person female : people) {
            if (FEMALE.equals(female.gender)){
                females.add(female);
            }
        }

        for ( Person person : females) {
            System.out.println(person.name);
        }

        //Declarative approach
        System.out.println("***********Declarative Approach*******************");
        List<Person> females2 = people.stream().filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(person -> System.out.println(person.name));
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE, FEMALE
    }
}
