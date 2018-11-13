
package bankaccount;

public class SavingsAccount extends Account{
    
    private static final double interestRate = 0.04;
    
    public SavingsAccount() {
        getAccountBalance();
    }
    
    public double CalculateInterest() {        
        double interestEarned = interestRate * getAccountBalance();
        return interestEarned;
    }
}
