class car
{
    String brand;
    int speed;
    void show()
    {
        System.out.println(brand+" "+speed);
    }
    public static void main(String[] args) {
        car c=new car();
        c.brand="BMW";
        c.show();
    }
}