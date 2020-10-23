public abstract class Account {
    //variables
    private int customerID;
    private Customer[] customers;
    private static int count = 0;
    private int accountID = 0;
    private double amount;

    //Constructor
    //default
    public Account() {

    }

    //new1
    public Account(int customerID, double amount){
        this.customerID = customerID;
        //accountID=count++;
        this.amount = amount;
    }

    //new2
    public Account(int customerID){
        this.customerID = customerID;
        //accountID=count++;
        this.amount = amount;
    }

    //new3
    public Account(Customer[] customers){
        this.customers = customers;
    }


    //methods and functions
    public abstract int getAccountID();

    public abstract double getAmount();
}
