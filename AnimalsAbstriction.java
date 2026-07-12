abstract class Animal
{
    public void sleep()
    {
        System.out.println("Zzz...");
    }
    abstract void makeSound();
    }
class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("Woof!Woof!");
    }
}