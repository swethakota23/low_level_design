package behavioral.state;

public class DispensingState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Wait! Dispensing in progress.");
    }
    @Override
    public void pressButton(VendingMachine machine) {
        System.out.println("Already processing.");
    }
    @Override
    public void dispense(VendingMachine machine) {
        if (machine.getItemCount() > 0) {
            System.out.println("Item dispensed.");
            machine.setItemCount(machine.getItemCount() - 1);
            machine.setState(new NoCoinState());
        } else {
            System.out.println("Out of stock.");
            machine.setState(new SoldOutState());
        }
    }
}
