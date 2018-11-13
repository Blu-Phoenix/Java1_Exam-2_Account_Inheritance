
package bankaccount;

public class BankAccount {
    
    public static void main(String[] args) {
        SavingsAccount sav = new SavingsAccount();
        sav.addCredit();
        sav.addDebt();
        System.out.printf("Total Interest: %.2f\n", sav.CalculateInterest());        
        System.out.printf("Balance after interest: %.2f\n", sav.getAccountBalance() + sav.CalculateInterest());

        CheckingAccount check = new CheckingAccount();
        check.addCredit();
        check.addDebt();
        System.out.printf("Current Balance: %.2f\n", check.getAccountBalance());
        
    }
}
