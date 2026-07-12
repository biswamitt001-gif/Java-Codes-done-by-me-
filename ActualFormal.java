class Actual
{
    int x;
    void f1()
    {
        int b=10;
        System.out.println("x");
        System.out.println("y");
    }
}
class local
{
    public static void main(String[] args)
    {
        Actual obj=new Actual();
        obj.f1();
        
    }
}