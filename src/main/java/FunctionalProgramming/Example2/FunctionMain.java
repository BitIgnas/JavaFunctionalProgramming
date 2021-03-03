package FunctionalProgramming.Example2;

import java.util.function.Function;

public class FunctionMain {
    public static void main(String[] args) {

        /**
         * Normal function in java
         * Takes an argument
         * returns ONE result
         * @param number which you world like to increase by one
         * @return incremented number by one
         */
        int increasedNumber = incrementByOneFunction(1);
        System.out.println(increasedNumber);

        //So after we declare a functional interface Function we can do like this:
        increasedNumber = incrementByOneFunction.apply(2);
        System.out.println(increasedNumber);

        //we want to do some additional logic with the same variable
        //after addition we want to multiply it

        int number = incrementByOneFunction.andThen(multiplyNumberBy2).andThen(substractFiveFromNumber).apply(3);
        System.out.println(number);

    }

    private static int incrementByOneFunction(int number) {
        return number + 1;
    }

    /**
     * This time, we will create a Function (functional interface)
     * We have to declare input and output
     */


    private static final Function<Integer, Integer> incrementByOneFunction = number -> number + 1;
    private static final Function<Integer, Integer> multiplyNumberBy2 = number -> number * 2;
    private static final Function<Integer, Integer> substractFiveFromNumber = number -> number - 5;
}
