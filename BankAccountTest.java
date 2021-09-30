public class BankAccountTest {
    public static void main(String[] args){
        // Creating Accounts
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount(500);
        BankAccount ba3 = new BankAccount(500, 1000);

        // Testing Methods
        System.out.println(ba3.getCheckingBalance());
        System.out.println(ba3.getSavingsBalance());
        ba3.depositToChecking(200);
        ba3.depositToSavings(250);
        ba3.getCheckingBalance();
        ba3.getSavingsBalance();
        ba3.withdrawFromChecking(900);
        ba3.withdrawFromChecking(300);
        System.out.println(ba3.getCheckingBalance());

        // Testing Static Methods
        System.out.println("----- Static Methods -----");
        System.out.println(BankAccount.getNumOfAccounts());
        System.out.println(BankAccount.totalBankMoney());
    }
}