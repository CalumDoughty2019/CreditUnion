import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SavingsAccount extends Account{
    //variables
    private Customer[] customers;
    private static int count = 0;
    private int accountID = 0;
    private int customerID = 0;
    private double amount = 0;


    public SavingsAccount() {
        super();
    }
    public SavingsAccount(int customerID) {
        super(customerID);
    }
    //new3
    public SavingsAccount(Customer[] customers){
        this.customers = customers;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public int getAccountID() {
        return 0;
    }

    @Override
    public double getAmount() {
        return 0;
    }

    //methods and functions
    public void addSavingsAccount(int customerID){
        for(int i = 0; i < customers.length; i++){
            //customers[i].getCustomerID()
            if(customerID == customers[i].getCustomerID()){
                if(!customers[i].isHasSavings()){
                    //accountID=count++;
                    this.setAccountID(accountID=count++);
                    customers[i].setHasSavings(true);
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Please enter amount in: ");
                    this.setAmount(scanner.nextDouble());

                }
                else{
                    System.out.println("customer already has a savings account");
                }
            }
        }

    }

}
