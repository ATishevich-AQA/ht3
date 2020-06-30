package homework3;

public class Main {

    public static void main(String[] args) {
        Customer initialCustomer = new Customer();
        initialCustomer.setName("Aleksey");
        initialCustomer.setLastname("Tishevich");
        initialCustomer.setCity("Minsk");
        initialCustomer.setStreet("Lermontava");
        initialCustomer.setHouseNumber("12");

        System.out.println(initialCustomer.getFullName());
        System.out.println(initialCustomer.getFullAddress());


        Customer anotherCustomer = initialCustomer;
        System.out.println(anotherCustomer.getFullName());
        System.out.println(anotherCustomer.getFullAddress());


        Customer thirdCustomer = initialCustomer;
        System.out.println(thirdCustomer.getFullName());
        System.out.println(thirdCustomer.getFullAddress());


        // write your code here
    }
}
