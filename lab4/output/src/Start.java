import java.util.ArrayList;

public class Start
{
    public static void main(String[] args)
    {
        WaitList list=new WaitList();
        Table table=new Table(10);
        CollaborationObject collaborationObject=new CollaborationObject(list,table);
        Customer a=new Customer(3,"5108386090","AOA");//Initialize
        a.attach(collaborationObject);
        a.Register();

        Customer b=new Customer(7,"5108386090","BOB2");
        b.attach(collaborationObject);
        b.Register();

        Customer c=new Customer(2,"5108386090","COC3");
        c.attach(collaborationObject);
        c.Register();

        Customer d=new Customer(4,"5108386090","DOD");
        d.attach(collaborationObject);
        d.Register();

        Customer E=new Customer(2,"5108386090","EOE");
        E.attach(collaborationObject);
        E.Register();
        b.Customer_Check_out();


    }
}
