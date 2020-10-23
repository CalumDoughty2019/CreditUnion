public class LoanAccount extends Account{
    private double amount;
    private static int count = 0;
    private int accountID = 0;

    public LoanAccount(int customerID) {
        super(customerID);
    }

    @Override
    public int getAccountID() {
        return accountID;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
