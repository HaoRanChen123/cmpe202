
public class PizzaDecoratorex {

 interface Pizza{
     public String bakePizza();
    }
    public PizzaDecoratorex(){}

        public String makePizza(){
class BasicPizza implements Pizza{
     Pizza pizza;

    @Override
    public String bakePizza() {
        return "basic pizza";
    }
}
class PizzaDecorator implements Pizza{
     Pizza pizza;
     public PizzaDecorator(Pizza newpizza){
         this.pizza=newpizza;
     }

    @Override
    public String bakePizza() {
        return pizza.bakePizza();
    }
}
class ChickenPizza extends PizzaDecorator{

     public ChickenPizza(Pizza newpizza){
         super(newpizza);
     }

    @Override
    public String bakePizza() {
        return pizza.bakePizza()+" with chicken topping on";
    }
    }
    ChickenPizza chickenPizza=new ChickenPizza(new BasicPizza());
   return chickenPizza.bakePizza();
 }
 public static void main(String[] args){
     PizzaDecoratorex example=new PizzaDecoratorex();
    System.out.println(example.makePizza());

 }

}
