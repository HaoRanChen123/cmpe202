import java.util.Scanner;

public class Customer extends ConcreteSubject
{
    private int partynumber;
    private String TelephoneNumber;
    private String name;
    private String reply="";

    public Customer(int partynumber,String TelephoneNumber,String name)
    {
        this.partynumber=partynumber;
        this.TelephoneNumber=TelephoneNumber;
        this.name=name;

    }
    public int getPartynumber()
    {
        return partynumber;
    }
    public String getName(){return name;}
    public String getReply(){return reply;}
    public void  Register()
    {
        System.out.println("Hi,my name is "+this.name+" and I want to eat at Din_Tai_Fung");
        setState("Customer in");
        notifyCollaboration(this);
    }

    public void Customer_Check_out()
    {
        System.out.println(this.getName()+" finished food and ready to go");
        this.setState("Customer out");
        notifyCollaboration(this);
    }

    public void replyMessage()
    {
        Scanner scaner=new Scanner(System.in);
       reply=scaner.nextLine();
    }
}
