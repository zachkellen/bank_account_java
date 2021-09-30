class BankAccount {
    // Member Variables
    private double checkingBalance;
    private double savingsBalance;

    // Static Variables
    public static int numOfAccounts;
    public static double totalMoney;

    // Constructors
    public BankAccount(){
        numOfAccounts++;
    };

    public BankAccount(double checkingBalance){
        this.checkingBalance = checkingBalance;
        numOfAccounts++;
        totalMoney += checkingBalance;
    }

    public BankAccount(double checkingBalance, double savingsBalance){
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numOfAccounts++;
        totalMoney += checkingBalance + savingsBalance;

    }

    // Getters
    public double getCheckingBalance(){
        return this.checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    // Setters
    // public void setCheckingBalance(double checkingBalance){
    //     this.checkingBalance = checkingBalance;
    // }

    // public void setSavingsBalance(double savingsBalance){
    //     this.savingsBalance = savingsBalance;
    // }

    // Methods
    public void depositToChecking(double amount){
        this.checkingBalance += amount;
        totalMoney += amount;
        System.out.println("Your total checking balance is: " +  this.getCheckingBalance());
    }
    public void depositToSavings(double amount){
        this.savingsBalance += amount;
        totalMoney += amount;
        System.out.println("Your total savings balance is: " + this.getSavingsBalance());
    }

    public void withdrawFromChecking(double amount){
        if(this.getCheckingBalance() < amount){
            System.out.println("Insufficient funds for withdrawl! Sorry you are poor.");
        } else {
            this.checkingBalance -= amount;
            System.out.println("Your total checking balance is: " + this.getCheckingBalance());
        }
    } 

    public void getTotalFunds(){
        System.out.println("Your total funds equal: " + (this.getCheckingBalance() + this.getSavingsBalance()));
    }

    // Static Methods
    public static int getNumOfAccounts(){
        return numOfAccounts;
    }
    public static double totalBankMoney(){
        return totalMoney;
    }
}