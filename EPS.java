abstract class  Employee{
    protected string nmae;
    protected string empolyee Id;
    public Employee (string name,string employee Id)
    {
        this.name=name;
        this.employeeID=employeeId;
    }
    public abstract double calculateMonthlyPay();
    public void printPaystub()
    {
        System.out.println(name+"(Id:"+employeeId+")Pay:$"+calculateMoney*pay());
    }
}
class ContractEmployee extends Employee
{
    private double hourlyRate;
    private  int hoursWorked;
    publicContractE
}