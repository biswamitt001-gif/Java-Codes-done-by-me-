class Person
{
    private string name;
    private Adress adress;
    public person(string name,Address adress)
    {
        this.name=name;
        this.address=new adress(adress);
    }
    public Address getAddress()
    {
        return new Address(address);
    }
}
class Address
{
    private String city;
    public address(String city)
    {
        this.city=city;
    }
    public Address(Address other)
    {
        this.city=city;
    }
}