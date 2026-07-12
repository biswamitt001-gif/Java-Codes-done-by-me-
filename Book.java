class Book
{
    String title;
    int price;
    void show()
    {
        System.out.println(title+" "+price);
    }
    public static void main(String[] args) {
        Book b=new Book();
        b.title="Java";
        b.price=350;
        b.show();
    }
}