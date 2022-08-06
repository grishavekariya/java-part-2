/* ID NO: 21CE153
NAME: Grisha Vekariya
AIM: (Subclasses of Account) In Programming Exercise 9.7, the Account 
class was defined to model a bank account. An account has the properties account number, balance, annual interest rate, and date created, and methods to deposit and Withdraw funds. Create two subclasses for checking and saving accounts.
A checking account has an overdraft limit, but a savings account cannot be overdrawn.
 */ 
 class SavingsAccount extends Account {
public SavingsAccount() {
super();
}
public SavingsAccount(int id, double balance) {
super(id, balance);
}
public void withdraw(double amount) {
if (amount < getBalance()) {
setBalance(getBalance() - amount);
}
else
   System.out.println("Error! Savings account overdrawn transtaction rejected");
}
}
class CheckingAccount extends Account 
{
  private double overdraftLimit;
  public CheckingAccount() {
  super();
  overdraftLimit = -20;
}
public CheckingAccount(int id, double balance, double overdraftLimit) 
{
  super(id, balance);
  this.overdraftLimit = overdraftLimit;
}
  public void setOverdraftLimit(double overdraftLimit) 
{
  
    this.overdraftLimit = overdraftLimit;
}
public double getOverdraftLimit() 
{
   return overdraftLimit;
}
public void withdraw(double amount) 
{
if (getBalance() - amount > overdraftLimit) 
{
    setBalance(getBalance() - amount);
}
else
  System.out.println("Error! Amount exceeds overdraft limit.");
}
public String toString() 
{
 return super.toString() + "\nOverdraft limit: " + String.format("%.2f", overdraftLimit);
}
}

