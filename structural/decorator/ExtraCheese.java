package structural.decorator;

public class ExtraCheese extends PizzaDecorato {
    public ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
