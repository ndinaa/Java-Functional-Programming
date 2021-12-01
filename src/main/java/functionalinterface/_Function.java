package functionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment =  Increment(0);
        System.out.println(increment);

        int increment2 = IncrementTheMultiply.apply(1);
        System.out.println(increment2);
    }

    static Function<Integer, Integer> IncrementByoneFunction = number -> number + 1;

    static Function<Integer, Integer> MultiplyBy10 = number -> number * 10;

    static Function<Integer, Integer> IncrementTheMultiply = IncrementByoneFunction.andThen(MultiplyBy10);

    static int Increment(int number){
        return number + 1;
    }
}
