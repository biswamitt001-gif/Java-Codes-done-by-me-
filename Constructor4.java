class Laptop
{
    String brand;
    int price;
    Laptop(String b,int p)
    {
        brand=b;
        price=p;
    }
    void display()
    {
        System.out.println(brand+" "+price);
    }
    public static void main(String[] args)
    {
        Laptop l=new Laptop("HP",5000);
        l.display();
    }
}