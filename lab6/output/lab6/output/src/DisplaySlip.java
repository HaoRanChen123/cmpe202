public class DisplaySlip
{
    private String out1="";
    private String out2="";
    int width=40;
    public DisplaySlip(){
        out1="Patties - 1";
        out1+="\n\n\n";
        out1+="Order number:   45\n";
        for (int i=0;i<width/2;i++)
        out1+=" ";
        out1+="12/1/2016"+"   "+"1:46:54 PM\n";
        for (int i=0;i<width/2;i++)
            out1+=" ";
        out1+="FIVE GUYS\n";
        out1+="Sandwitch#1\n";
        out1+="1";
        for (int i=0;i<width/4;i++)
            out1+=" ";
        out1+="LBB\n";
        for (int i=0;i<width/2;i++)
            out1+=" ";
        out1+="LETTUCE\n";
        for (int i=0;i<width/2;i++)
            out1+=" ";
        out1+="TOMATO\n";
        for (int i=0;i<width/2;i++)
            out1+=" ";
        out1+="->|G onion\n";
        for (int i=0;i<width/2;i++)
            out1+=" ";
        out1+="->|JALA Grilled\n";
        for (int i=0;i<width/2;i++)
            out1+=" ";
        out1+="{{{{BACON}}}}\n";
        out1+="1";
        for (int i=0;i<width/4;i++)
            out1+=" ";
        out1+="LTL CAJ\n";
        out1+="Register:1"+"              "+"tran Seq No:"+"      "+"57845\n";
        out1+="Cashier:Sakda* S.";

        System.out.println(out1);



    }

}
