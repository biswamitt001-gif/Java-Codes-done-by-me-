class Parent{
    parent()
    {
        System.out.println("Parent Constructor");
    }
}
class child extends parent
{
  child()
  {
    System.out.println("child constructor");
  }
public static void main(String[] args)
{
    new child();
}
}
