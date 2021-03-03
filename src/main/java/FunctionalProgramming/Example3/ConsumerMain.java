package FunctionalProgramming.Example3;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Consumer fuctional interface
 * Accepts ONE argument and return no result. Consumes it.
 *Acts like a void function witout return type
 */
public class ConsumerMain {
    public static void main(String[] args) {
        /**
         * regular approach(imperative)
         */
        Customer customer = new Customer("Maria", "+3704353455");
        greetCustomer(customer);

        /**
         * Functional programming approach
         */

        greetCustomer.accept(customer);
        greetCustomerBiConsumer.accept(customer, true);
        greetCustomerBiConsumer.accept(customer, false);
    }

    //Regular method
    private static void greetCustomer(Customer customer) {
        System.out.println("Hello, " + customer.getName()
                + " thanks for registering, your phone number: "
                + customer.getPhoneNumber());
    }

    //Consumer functional interface approach
    private static Consumer<Customer> greetCustomer = customer -> System.out.println("Hello, " + customer.getName()
            + " thanks for registering, your phone number: "
            + customer.getPhoneNumber());

    private static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = ((customer, showPhone) ->
            System.out.println("Hello, " + customer.getName() + ", thanks for registering " + (showPhone ? customer.getPhoneNumber() : "***********")));

}
@Getter @Setter @AllArgsConstructor
class Customer{

    private String name;
    private String phoneNumber;
}