public class Client {
    public static void main(String[] args) {
        Pizza pizza = new ChickenPizza(new BasicPizza());
        System.out.println(pizza.bakePizza());

    }
}
