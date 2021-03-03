package FunctionalProgramming.Example4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate functional interface represents single argument fucntion that returns a boolean value
 */
public class PredicateMain {
    public static void main(String[] args) {
        /**
         * Regular approach
         */

        System.out.println(isPhoneNumberValid("+370404300"));
        System.out.println(isPhoneNumberValidPredicate.test("+370404300"));

        List<String> lines = new ArrayList<>();
        lines.add("+370404300");
        lines.add("+470404300");
        lines.add("+370467300");

        lines.stream().filter(phoneNumber -> phoneNumber.startsWith("+370")).forEach(System.out::println);
    }

    private static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber
            .startsWith("+370") && phoneNumber.length() == 10;

    private static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+370") && phoneNumber.length() == 10;
    }
}
