package FunctionalProgramming.Example2;

import java.util.function.BiFunction;

public class BiFunctionMain {
    public static void main(String[] args) {

        //Regular approach

        int myNumber = incrementByOneAndMultiply(5, 3);
        System.out.println(myNumber);

        int myOtherNumber = incrementByOneAndMultiply.apply(5, 3);
        System.out.println(myOtherNumber);

    }

    private static int incrementByOneAndMultiply(int numberToProcess, int multiplyBy) {
        return (numberToProcess + 1) * multiplyBy;
    }

    private static final BiFunction<Integer, Integer, Integer> incrementByOneAndMultiply =
            (numberToProcess, multiplyBy) -> (numberToProcess + 1) * multiplyBy;

}
