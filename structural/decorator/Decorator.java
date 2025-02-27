package structural.decorator;

// Base Decorator class
public class Decorator {
    // Constructor
    public static void main(String[] args) {
        BasePizza pizza = new FarmHouse();
        System.out.println("Cost of FarmHouse Pizza: " + pizza.cost());
        
        BasePizza cheesePizza = new ExtraCheese(pizza);
        System.out.println("Cost of FarmHouse Pizza with Extra Cheese: " + cheesePizza.cost());
    }
}
