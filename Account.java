
package bankaccount;

import java.util.Scanner;

public abstract class Account {
   
    protected double accountBalance;
    protected boolean trans = true;
    
    Scanner scan = new Scanner(System.in);
    
    public Account() {
        
        System.out.println("Enter Starting Account Balance: ");
        double tAccountBalance = scan.nextDouble();
        
        if (accountBalance < 0) {
            System.out.println("Error, you entered a balance that was less then 0.00 dollars");
        } else {
            accountBalance = tAccountBalance;
        }
    }
    
    public double addCredit() {
        
        System.out.println("Enter your deposit amount: ");
        double credit = scan.nextDouble();
        
        if (credit > 0 ) {
            accountBalance = accountBalance + credit;
        } else {
            System.out.println("Error, credit must be positive.");
        }
        return accountBalance;
    }
    
    public double addDebt() {
        
        System.out.println("Enter your withdraw amount: ");
        double debt = scan.nextDouble();
        
        if (debt > accountBalance) {
            System.out.println("Error, debt amount exceeded account balance.");
            trans = false;
        } else {
            accountBalance = accountBalance - debt;
        }        
        return accountBalance;
    }
    
    public double getAccountBalance() {
        return accountBalance;
    }
    
    public void printAccountBalance() {
        System.out.printf("Current Balance: %d\n", accountBalance);
    }
}
