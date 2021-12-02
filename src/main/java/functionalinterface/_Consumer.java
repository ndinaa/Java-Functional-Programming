package functionalinterface;

import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        Customer ndina = new Customer("ndina", "90909090");
        greetingsConsumer.accept(ndina);
    }



    //non functional

    private static void greetings(Customer customer){
        System.out.println( "hello " + customer.customerName + " your cellphone number is " + customer.customerNumber);
    }


    //functional

    static Consumer<Customer> greetingsConsumer =
            customer -> System.out.println( "hello " + customer.customerName + " your number is " + customer.customerNumber);


    static class Customer {
        private final String customerName;
        private final String customerNumber;

        public Customer(String customerName, String customerNumber) {
            this.customerName = customerName;
            this.customerNumber = customerNumber;
        }

        @Override
        public String toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerNumber='" + customerNumber + '\'' +
                    '}';
        }
    }
}
