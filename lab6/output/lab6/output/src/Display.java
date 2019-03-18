import org.omg.CORBA.PUBLIC_MEMBER;

public class Display {
    private Title title;
    private String order;
    public static int width=40;
    public  static int length=70;
    private String out1;
    private String out2;
    private String out3;
    private String out4;
    public Display(Title title,String order){
        this.title=title;
        this.order=order;

    }
    public void displayOrder(String[] order){

    }

    public void displaytitle(String[] title){
        int halfwidth=width/2;
        for (int i=0;i<title.length-1;i++){
            for (int j=0;j<halfwidth-title[i].length()/2;j++){
                System.out.print(" ");}
                System.out.println(title[i].toString());

        }
        System.out.println(title[10]);
    }
    public void combine(){
        this.out1="1     LBB";
        for (int i=0;i<width;i++){
            out1+=" ";}
        out1+="5.99";

        Topping_check topping=new Topping_check();
        On_meat_check onmeat=new On_meat_check();
        Addfunction addfunction=new Addfunction();
        addfunction.addsubcomponent(topping);
        addfunction.addsubcomponent(onmeat);
        out2="";
        out2+=topping.check("\"below_meat_stuff\"");
        out2+=topping.check("\"make toping\"");
        out2+=topping.check("make on_meat_stuff");

        this.out3="1     CAJ";
        for (int i=0;i<width;i++){
            out3+=" ";}
        out3+="2.79";

        out4="";
        this.out4="SUB. TOTAL:";
        for (int i=0;i<width-2;i++){
            out4+=" ";}
        out4+="$8.38\nTAX:";
        for (int i=0;i<width+2;i++){
            out4+=" ";}
        out4+="$0.76\nTOTAL:";
        for (int i=0;i<width;i++){
            out4+=" ";}
        out4+="$9.14\nCash $20";
        for (int i=0;i<width-2;i++){
            out4+=" ";}
        out4+="$20\nChange";
        for (int i=0;i<width;i++){
            out4+=" ";}
        out4+="$10.86";


        System.out.println(out1);
        System.out.println(out2);
        System.out.println(out3);
        System.out.println(out4);

    }


}
