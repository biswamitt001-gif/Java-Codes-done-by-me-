class Demo
{
    Demo()
    {
        Show();
    }
    void Show()
    {
        System.out.println("Method called from constructor");
    }
    public static void main(String[] args)
    {
        new Demo();
    }
}