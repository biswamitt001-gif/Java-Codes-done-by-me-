class Transaction
{
    String type;
    int amount;
    Transaction(String type,int amount)
    {
        this.type=type;
        this.amount=amount;
    }
    void show()
    {
        System.out.println(type+":"+amount);
    }
}
class BankAccount
{
    int balance=0;
    Transaction[]history=new Transaction[5];
    int count=0;

    void deposit(int amt)
    {
        balance+=amt;
        history[count++]=new Transiction("Deposit",amt);
    }
    void withdraw(int amt)
    {
        if(amt<=balnce)
        {
            balance-=amt;
            history[count++]=new Transaction("Withdraw", amt);
        }
    }
    void  History()
    {
        for(int i=0;i<count;i++)
        {    history[i].show();
        }
    }
    public static void main(String[] args)
    {
        BankAccount b=new BankAccount();
        b.deposit(1000);
        b.withdraw(300);
        b.deposit(500);
        b.showHistory();
    }

}