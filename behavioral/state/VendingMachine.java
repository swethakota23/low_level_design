package behavioral.state;

public class VendingMachine {
    private VendingMachineState state;
    private int itemCount;

    public VendingMachine(int itemCount) {
        this.itemCount = itemCount;
        this.state = (itemCount > 0) ? new NoCoinState() : new SoldOutState();
    }

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void setItemCount(int count) {
        this.itemCount = count;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void pressButton() {
        state.pressButton(this);
        state.dispense(this);
    }
}
