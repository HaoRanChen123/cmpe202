import java.awt.*;

public class Title
{
    private String[] title=new String[11];
    public  Title(){
        title[0]="FIVE GUYS";
        title[1]="BURGERS AND FRIES";
        title[2]="STORE # CA-1294";
        title[3]="5353 ALMADEN EXPY N60";
        title[4]="SAN JOSE , CA 95118";
        title[5]="(P) 408-9300";
        title[6]="";
        title[7]="";
        title[8]="12/1/2016  1:46:54 PM";
        Font font=new Font("",Font.BOLD,30);
        String s="FIVE GUYS 45";
        title[9]=s;
        title[10]="Order Number:";
    }
    public String[] getTitle(){
        return title;
    }
}
