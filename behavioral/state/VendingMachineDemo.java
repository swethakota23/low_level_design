package behavioral.state;

public class VendingMachineDemo {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine(1);

        machine.insertCoin();
        machine.pressButton();
      

        System.out.println("*****");
        machine.insertCoin();
        machine.pressButton();

        System.out.println("*****");
        machine.insertCoin();
        machine.pressButton();

    }
}