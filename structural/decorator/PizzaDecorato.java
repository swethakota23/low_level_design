package structural.decorator;

public abstract class PizzaDecorato extends BasePizza {
    
    protected BasePizza basePizza;

    public PizzaDecorato(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
}
