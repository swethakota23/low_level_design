package behavioral.state;

public class SoldOutState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Machine is out of stock.");
    }

    @Override
    public void pressButton(VendingMachine machine) {
        System.out.println("No items available.");
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Cannot dispense, out of stock.");
    }
}