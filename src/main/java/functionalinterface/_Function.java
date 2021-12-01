package functionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int increment =  Increment(0);
        System.out.println(increment);

        int increment2 = IncrementByoneFunction.apply(0);
        System.out.println(increment2);
    }

     static Function<Integer, Integer> IncrementByoneFunction = number -> number + 1;

    static int Increment(int number){
        return number + 1;
    }
}
