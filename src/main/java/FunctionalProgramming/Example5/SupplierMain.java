package FunctionalProgramming.Example5;

import java.util.function.Supplier;

/**
 * Supplier functional interface
 * Does not take any arguments But produces the RESULT (Has a return type)
 * NOTE: Consumer is the opposite
 */

public class SupplierMain {
    public static void main(String[] args) {
        /**
         * Regular approach
         */

        System.out.println(getDBConnection());

        /**
         * Supplier approach
         */

        System.out.println(getDBConnectionURLSupplier.get());

    }
    private static Supplier<String> getDBConnectionURLSupplier = () -> "jdbc://localhost:5432/userDB";

    private static String getDBConnection() {
        return "jdbc://localhost:5432/userDB";
    }
}
