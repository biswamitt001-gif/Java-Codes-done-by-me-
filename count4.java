class Digits
{
    public static void main(Strin[] args)
    {
        int n=123456;
        int count=0;
        while(n>0)
        {
            int digit = n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        System.out.println(rev);
    }
}