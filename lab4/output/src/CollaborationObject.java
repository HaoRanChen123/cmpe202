public class CollaborationObject extends ConcreteObserver{

    private WaitList waitList;
    private Table avaliableSeats;

    public CollaborationObject(WaitList list,Table avaliableSeats)//Collaboration observer Customer,just like we enter the restaurant, there is a waiter come to help.
    {
        this.waitList=list;
        this.avaliableSeats=avaliableSeats;

    }
    public void findSeats(Customer a)                              // if seats are avaliable, then don't need to go to waitlist.
    {
            if (avaliableSeats.getAvaliableSeats()-a.getPartynumber()>=0)
            {
                this.Have_a_Seat(a);
            }
            else
                {
                    System.out.println("Sorry, we are full now, you will get into the WaitList");//  full! so need to go to waitlist
                    waitList.add(a);
                    System.out.println(waitList.size());
                }

    }

    public void Have_a_Seat(Customer a)
    {
       avaliableSeats.setAvaliableSeats(avaliableSeats.getAvaliableSeats()-a.getPartynumber());
       System.out.println(a.getName()+"  the guest has sat down");

    }

    public  void prepareTable(Customer a)                       // when customer are leaving, we should rearrange tables
    {
        avaliableSeats.setAvaliableSeats(a.getPartynumber()+avaliableSeats.getAvaliableSeats());
        if (waitList.size()>0)
        {
            for (int i=0;i<waitList.size();i++)
            {
                Customer temp=(Customer) waitList.get(i);
                if (temp.getPartynumber()<avaliableSeats.getAvaliableSeats())
                {
                    System.out.println("We have empty table!");
                    this.sendMessage(temp);
                    temp.replyMessage();                        // You have to enter the reply in the bottom debugger then the program can continue;
                    if (temp.getReply().equals("yes"))          //Actually I want to write a thread to count as a timer, if Customer doesn't reply
                    {                                           // it should automactically goes to next customer.But I think it's not the purpose for this lab.
                        Have_a_Seat(temp);
                        waitList.POP(i);
                    }
                    if (temp.getReply().equals("leave")){
                        waitList.POP(i);
                    }
                }
            }
        }

    }
    public void update(Customer a) {
        if (a.getState().equals("Customer in"))
        {
            findSeats(a);
        }
        if (a.getState().equals("Customer out"))
        {
            prepareTable(a);
        }
    }

    public void sendMessage(Customer a)
    {
        System.out.println(a.getName()+ "You are in the top of the List. Do you want to come in? yes for eating leave for leaving");

    }



}
