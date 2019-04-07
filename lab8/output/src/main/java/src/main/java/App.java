/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
import java.util.regex.Matcher; import java.util.regex.Pattern;
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;
   // private SpaceDecorator decorator;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();
       // decorator=new SpaceDecorator();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);


        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {


        Pattern pattern = Pattern.compile("[0-9]{1,}");
        Matcher matcher = pattern.matcher((CharSequence) ch);

        if (matcher.matches()){
        count++;
        screen.key(ch, count);
        }
        if (ch.equals("x")){
            screen.backspace(count);
            count--;
        }

    }

}

