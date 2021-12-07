package streams;

import java.util.List;

import static streams.Streams.Gender.*;

public class Streams {

    public static void main(String[] args) {
        List<Person> people = List.of(
          new Person("humbe", MALE),
          new Person("suzan", FEMALE),
          new Person("Duncan", MALE),
          new Person("Mahamood", MALE),
          new Person("Solomon", MALE)
        );
}

    static class Person {
        private final String name;
        private final Gender gender;

         Person(String name, Gender gender) {
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
