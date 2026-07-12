import java.util.Scanner;
class Arath
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number:");
        int a=sc.nextInt();
        System.out.println("Enter Second Number:");
        int b=sc.nextInt();
        System.out.println("Sum=" + (a+b));
        System.out.println("Multi="+(a*b));
    }
}