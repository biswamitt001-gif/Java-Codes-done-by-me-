class BankAccount
{
    private double balance;
    public void deposit(double amount)
    {
        if (amount>0)
        {
            balance+=amount;
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }
    public static void main(String[] args) 
    {
        if(amount>0 && amount <=balance)
        {
            balance-=amount;
        }
        else
        {
            System.out.println("Insufficent balance or  invalid amount");
        }
    }
    public double getBalance()
    {
        return balance;
    }
    public class Main{
        public static void main(String[] args) 
        {
            BankAccount acc=new BankAccount();
            acc.deposit(1000);
            acc.withdraw(300);
            System.out.println("Balance:"+acc..getBalance);

        }
    }
}