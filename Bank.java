class Bank
{
    int balance=1000;
    void depeosit(int amt)
    {
        balance=balance+amt;
        System.out.println(balance);
    }
    public static void main(String[] args)
    {
        Bank b=new Bank();
        b.deposit(500);
    }
}