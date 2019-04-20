public class ChickenPizza extends PizzaDecorator {
    public ChickenPizza(Pizza newPizza) {
        super(newPizza);
    }
    public String bakePizza() {
        return pizza.bakePizza() + " with Chicken topping added";
    }
}