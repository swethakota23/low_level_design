package behavioral.state;

public class HasCoinState implements VendingMachineState {
    @Override
    public void insertCoin(VendingMachine machine) {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void pressButton(VendingMachine machine) {
        System.out.println("Button pressed. Dispensing item...");
        machine.setState(new DispensingState());
    }

    @Override
    public void dispense(VendingMachine machine) {
        System.out.println("Press button first.");
    }
}

