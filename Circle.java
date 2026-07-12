class circle
{
    double radius;
    void area()
    {
        System.out.println(3.14*radius*radius);
}

public static void main(String[] args) {
    circle c=new circle();
    c.radius=7;
    c.area();
}
}