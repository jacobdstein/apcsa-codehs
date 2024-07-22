public class StudentAccount extends Account
{
    // Complete this class with Override methods.   
    
    public StudentAccount(int accountNumber, double openingBal){
        super(accountNumber, openingBal);
    }
    
    // Students get a 10% bonus on depositing
    public void deposit(double amount) {
        super.deposit(1.1 * amount);
    }
    
    // Students pay a $1.50 fee for withdrawing
    public void withdraw(double amount) {
        super.withdraw(amount + 1.50);
    }
    
    
    // toString() Should read: Student account current balance $__.__
    public String toString() {
        return "Student account current balance $" + getBalance();
    }
}