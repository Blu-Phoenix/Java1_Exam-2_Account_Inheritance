
package bankaccount;

public class CheckingAccount extends Account{
    
    private static final double fee = 0.12;
    
    public CheckingAccount() {
        getAccountBalance();
    }
    
    @Override
    public double addCredit() {
        accountBalance = super.addCredit() - fee;
        return accountBalance;
    }
    
    @Override
    public double addDebt() {
        super.addDebt();
        if(trans) {
            accountBalance = accountBalance - fee;
        }
        return accountBalance;        
    }
}
