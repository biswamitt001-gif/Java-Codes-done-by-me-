abstract class Appliance {
    public void plugIn() {
        System.out.println("Connected to power");
    }

    abstract void doWork();
}

class Toaster extends Appliance {
    @Override
    void doWork() {
        System.out.println("Toasting the bread!");
    }
}