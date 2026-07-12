class Primecheck{
    static boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
    for(int i=2;i*i;i++)
    {
        if(n%i==0)
        {
            return false;
        }
        return true;
    }
    }
    public static void main(String[] args)
    {
    {
        int n= 29;
        System.out.println(isprime(n)?"prime":"Not prime");
    }
    }
}