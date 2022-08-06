/*ID NO: 21CE153
NAME: Grisha Vekariya
AIM :Design a class named Account that contains:
•A private int data field namedid for the account (default 0).
•A private double data field named balance for the account (default 500₹)
*/   
import java.util.Date;
import java.util.Scanner;
public class pr_2 {
public static void main(String[] args)
{
    Date D = new Date();
    Account A = new Account();
    System.out.println("Enter your Account ID : ");
    Scanner s = new Scanner(System.in);
    A.setId(s.nextDouble());
    System.out.println("Enter your Balance : ");
    A.setBalance(s.nextDouble());
    System.out.println("Enter your Annual Interest : ");
    A.setAnnualInterestRate(s.nextDouble());
    System.out.println("-----------------------------------------");
    System.out.println("Account ID : " + A.getId());
    System.out.println("Balance : " + A.getBalance());
    System.out.println("Date : " + D );
    System.out.println("Monthly Interest Rate : " +  A.getMonthlyInterestRate());
    System.out.println("Monthly Interest : " + A.getMonthlyInterest());
    int flag = 1;
while(flag == 1)
{
    System.out.println("Enter 1 for Withdrawal and 2 for Deposit : ");
    int n = s.nextInt();
    switch (n) {
    case 1 ->
    {
    System.out.println("Enter the Amount you want to Withdraw : ");
    double temp=s.nextDouble();
    System.out.println("Withdrawal Successful!");
    System.out.println("Updated Balance is : " + A.Withdraw(temp));
         A.setBalance(A.Withdraw(temp));
}
case 2 ->
{
   System.out.println("Enter the Amount you want to Deposit : ");
   double temp=s.nextDouble();
   System.out.println("Deposit Successful!");
   System.out.println("Updated Balance is : " + A.Deposit(temp));
   A.setBalance(A.Deposit(temp));
}
default -> {
   System.out.println("Please Select a Valid Operation.");
   break;
}
}
    System.out.println("If you want to continue enter 1, or Exit =0:");
    flag = s.nextInt();
if(flag==0)
{
   break;
}
   }
  }
}

class Account 
{
       private double Id;
       private double Balance;
       private double AnnualInterestRate;
       private Date DateCreated;
       double Withdraw,Deposit;
Account() 
{
        Id = 0;
        Balance = 500;
        AnnualInterestRate = 0.07;
}
public void setId(double Id) 
{
this.Id = Id;
}
public double getId() 
{
return Id;
}
public void setDateCreated(Date dateCreated) 
{
DateCreated = dateCreated;
}
public Date getDateCreated() 
{
return DateCreated;
}
public void setBalance(double Balance) 
{
this.Balance = Balance;
}
public double getBalance() 
{
return Balance;
}
public void setAnnualInterestRate(double AnnualInterestRate)
{
this.AnnualInterestRate = AnnualInterestRate;
}
public double getAnnualInterestRate() {
    return AnnualInterestRate;
}
double Withdraw(double Withdraw)
{
 return(Balance-Withdraw);
}
double Deposit(double Deposit)
{
 return(Balance+Deposit);
}
double getMonthlyInterestRate()
{
 return((AnnualInterestRate/100)/12);
}
double getMonthlyInterest()
{
 return(getMonthlyInterestRate()*Balance);
}
}
