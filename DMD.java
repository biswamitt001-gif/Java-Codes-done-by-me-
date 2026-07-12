class A{
    void f1()
    {
        System.out.println("hii");
    }
}
class B extends A
{
    void f1()
    {
        System.out.println("Hello");
    }
}
class DMD
{
    public static void main(String[] args) {
        A obj= new B();
        obj.f1();
    }
}