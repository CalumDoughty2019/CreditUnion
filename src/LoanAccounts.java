import java.util.Scanner;

public class LoanAccounts {
    //variables
    private LoanAccount[] loanAccounts;

    public LoanAccounts() {

    }

    //methods and functions
    //Allow the user to input up to 3 loan accounts
    public void addLoanAccounts(){
        Scanner scanner = new Scanner(System.in);
        int numAccounts;

        System.out.println("Please enter customerID: ");
        int customerID = scanner.nextInt();

        //could use an if here to throw error message (I have opted for do-while)
        do {
            System.out.println("Please enter number of loan Accounts: ");
            numAccounts = scanner.nextInt();
            loanAccounts = new LoanAccount[numAccounts];
            System.out.println("");
        } while (numAccounts < 0 || numAccounts > 3);

        for (int i = 0; i < loanAccounts.length; i++) {
            LoanAccount anotherOne = new LoanAccount(customerID);
            //SavingsAccount.setAccountID();
            //int j = i+1;
            System.out.println("Account ID. " + anotherOne.getAccountID() + ": ");
            System.out.println("Please enter an amount: ");
            anotherOne.setAmount(scanner.nextDouble());
            loanAccounts[i] = anotherOne;
            System.out.println("");
        }
    }
}
