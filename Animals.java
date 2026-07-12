abstract class Animal {
    public void sleep() {
        System.out.println("ZZz");
    }

    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}