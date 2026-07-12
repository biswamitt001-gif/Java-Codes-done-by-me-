class Employee
{
    int id;
    double salary;
    void display()
    {
        System.out.println(id+" "+salary);
    }
    public static void main(String[] args)
    {
        Employee e=new Employee();
        e.id=1;
        e.salary=50000;
        e.display();
    }
}