import java.util.Scanner;

public class Customers {
    //variables
    private Customer[] customers;

    //methods and functions
    //Allow the user to input up to 3 customers
    public void addCustomers(){
        Scanner scanner = new Scanner(System.in);
        int numCustomers;

        //could use an if here to throw error message (I have opted for do-while)
        do {
            System.out.println("Please enter number of customers: ");
            numCustomers = scanner.nextInt();
            customers = new Customer[numCustomers];
            System.out.println("");
        } while (numCustomers < 0 || numCustomers > 3);

        for (int i = 0; i < customers.length; i++) {
            Customer anotherOne = new Customer();
            int j = i+1;
            System.out.println("Customer ID. " + anotherOne.getCustomerID() + ": ");
            System.out.println("Please enter a name: ");
            anotherOne.setName(scanner.next());
//            System.out.println("Please enter a height: ");
//            anotherOne.setHeight(scanner.nextDouble());
//            System.out.println("Please enter a colour: ");
//            anotherOne.setColour(scanner.next());

            customers[i] = anotherOne;
            System.out.println("");
        }
    }

    //Allow the user to retrieve customers
    public Customer[] getCustomers(){
        return customers;
    }
}
