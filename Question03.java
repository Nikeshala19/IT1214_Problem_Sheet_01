class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Bank {
    private BankAccount[] bankAccounts = new BankAccounts[5];
    private int count = 0;
    }

    public void addAccount(BankAccount account) {
        if (count < bankAccounts.length) {
            bankAccounts[count] = account;
            count++;
        } else {
            System.out.println("Bank Account is reached it's limit");
        }
    }

    public void withdraw(int accountNumber, double amount) {
        for (int i = 0; i < count; i++) {
           
            }
        }
       

    public void displayAccounts() {
        for (int i = 0; i < count; i++) {
            System.out.println("Account Number: " + bankAccounts[i].getAccountNumber() +
                    ", Holder: " + bankAccounts[i].getAccountHolder() +
                    ", Balance: " + bankAccounts[i].getBalance());
        }
    }
}

pubpulic class Question03 {
    public static void main(String[] args) {
        Bank bank = new Bank(5); 

        BankAccount account1 = new BankAccount(1001, "Alice", 5000.0);
        BankAccount account2 = new BankAccount(1002, "Bob", 3000.0);

        bank.addAccount(account1);
        bank.addAccount(account2);

        bank.displayAccounts(); 
    }
}