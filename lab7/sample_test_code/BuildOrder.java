

public class BuildOrder {

    public static Component getOrder()
    {
       double total;
        Composite order = new Composite( "Order" ) ;
        //order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
        //order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        CustomBurger customBurger2=new CustomBurger("Build Your Own Burger");
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*{+$4.00}", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2={"Hormone&Antibiotic Free Beef","1/3lb.","On A Bun"};
        b2.setOptions(bo2);
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        
        
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        
        
        //premiumchees
        PremiumCheese precheese=new PremiumCheese("PremiumCheese");
        String[] cheese={"Danish Blue Cheese"};
        precheese.setOptions(cheese);
        precheese.wrapDecorator(c);
        
        
        
        
        PremiumCheese precheese2=new PremiumCheese("PremiumCheese");
        String[] cheese2={"Fresh Mozzarella"};
        precheese2.setOptions(cheese2);
        precheese2.wrapDecorator(c2);
        
        //sauce
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Thai Peanut Sauce","Mayonnaise" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( precheese ) ;
        
        
        
        
        
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( precheese2 ) ;
        
        // 4 toppings free, extra +.75
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles", } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        // premium topping +1.50
        
         Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts", } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( s2 ) ;
        
        
        
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        
        
         Premium p2 = new Premium( "Premium Options" ) ;
        String[] po2 = { "Sunny Side Up Egg*","Marinated Tomatoes" } ;
        p2.setOptions( po2 ) ;
        p2.wrapDecorator( t2 ) ;
        
        
        
        
        // 1 sauce free, extra +.75
        Bun bun=new Bun("Bun Options");
        String[] buno={"Ciabatta"};
        bun.setOptions(buno);
        bun.wrapDecorator(p);
        
        
        Bun bun2=new Bun("Bun Options");
        String[] buno2={"Gluten-Free Bun{+$1.00}"};
        bun2.setOptions(buno2);
        bun2.wrapDecorator(p2);
        
        
        //Side
        Side side=new Side("Side Option");
        String[] sideo={"Shoestring Fries"};
        side.setOptions(sideo);
        side.wrapDecorator(bun);
        
        Side side2=new Side("Side Option");
        String[] sideo2={"Shoestring Fries"};
        side2.setOptions(sideo2);
        side2.wrapDecorator(bun2);
        
        
        
       
        
        
        // Setup Custom Burger Ingredients
         
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild(precheese);
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild(bun);
        customBurger.addChild(side);
      
        
        customBurger.setDecorator(side);
       
        
        
      
      
        
        
       
       
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild(precheese2);
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( p2 ) ;
        customBurger2.addChild(bun2);
        customBurger2.addChild(side2);
       
        customBurger2.setDecorator(side2) ;
        
        
        
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        order.addChild(customBurger2);
        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/