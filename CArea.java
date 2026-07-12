class Area{
    Area(int side)
    {
        System.out.println("Squre Area:"+(side*side));
    }
    Area(int l,int b)
    {
        System.out.println("Rectangle Area :"+(l*b));
    }
    public static void main(String[] args)
    {
        new Area(5);
        new Area(4,6);
    }
}