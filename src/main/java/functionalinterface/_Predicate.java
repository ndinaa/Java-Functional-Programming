package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        System.out.println("without predicate");
        System.out.println(isValidNumber("07000000000"));
        System.out.println(isValidNumber("07000000000900"));
        System.out.println(isValidNumber("09000000000900"));

        System.out.println("with predicate");
        System.out.println(isValidNumberPredicate.test("07000000000"));
        System.out.println(isValidNumberPredicate.test("07000000000000"));
        System.out.println(isValidNumberPredicate.test("08000000000000"));

        System.out.println( isValidNumberPredicate.and(containsThree).test("07000000000"));
        System.out.println( isValidNumberPredicate.and(containsThree).test("07300000000"));

        System.out.println(isValidNumberPredicate.or(containsThree).test("07300000000"));
    }

    static boolean isValidNumber(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    }

    static Predicate<String> isValidNumberPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsThree = phoneNumber ->
            phoneNumber.contains("3");

}


