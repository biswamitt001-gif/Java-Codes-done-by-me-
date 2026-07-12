class Perfect
{
    static boolean isPerfect(int n)
    {
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                Sum+=i;
        }
        return sum==n;
    }
    public static void main(String[] args) {
        {
            System.out.println(isPerfect(20));
        }
    }
}