import java.awt.*;
import java.util.Locale;

public class Receipt
{
    public String  headlines="---------------------------------------------------------------------------";
     public int headline=headlines.toString().length();
    String location[]=new String[10];
    String[] order=new String[14];

    public String[] location(){
        location[0]="Five GUYS";
        location[1]="BURGERS AND FRIES";
        location[2]="STORE # CA1294";
        location[3]="5353 ALMADEN EXPY N60";
        location[4]="SAN JOSE, CA 95118";
        location[5]="(P) 408-264-9300";
        location[6]="";
        location[7]="12/1/2016  1:46:54PM";
        location[8]="Five GUYS";
        location[9]="45";
        order[0]="1     LBB                                                                                                                           5.59";
        order[1]="                    {{{{BACON}}}}";
        order[2]="                     LETTUCE";
        order[3]="                     TOMATO";
        order[4]="                     ->|G ONION";
        order[5]="                     ->|JALA Grilled";
        order[6]="1     LTL CAG                                                                                                                        2.79";
        order[7]="Sub.Total:                                                                                                                            $8.83";
        order[8]="TAX                                                                                                                                   $0.76";
        order[9]="Total:                                                                                                                                 $9.14";
        return location;
    }

    public void display()
    {
    for (int i=0;i<location().length;i++){
        for (int j=0;j<headline-location[i].length()/2;j++)
            System.out.print(" ");
        System.out.println(location[i]);
    }
    }
    public void displayorder(){
        for (int i=0;i<order.length;i++){
            for (int q=0;q<headline-order[i].length();q++)
            {
                System.out.print(" ");

            }
            System.out.println(order[i]);
        }

    }



    }




