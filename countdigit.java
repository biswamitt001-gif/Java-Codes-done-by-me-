class CountDigits 
{
    public static void main(String[] args)
    {
        int n = 123456;
        int count = 0;
        while(n>10)
        {
            count++;
            n/=10;
        }
        System.out.println("Digits =" + counts);
    }
}