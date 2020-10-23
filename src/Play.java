public class Play {
    public static void main(String[] args){
        Customer customer = new Customer();
        Customers customers = new Customers();

        customers.addCustomers();
        SavingsAccount savingsAccount = new SavingsAccount(customers.getCustomers());
        savingsAccount.addSavingsAccount(1);
        LoanAccounts loanAccount = new LoanAccounts();
        loanAccount.addLoanAccounts();


    }
}
