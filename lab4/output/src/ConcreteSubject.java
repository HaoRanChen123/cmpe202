import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    private String state="";
    private ArrayList<Observer> observers= new ArrayList<Observer>();
    public String getState(){
        return state;
    }
    public void setState(String state){
        this.state=state;
    }
    public void attach(Observer observer)
    {
        observers.add(observer);
    }
    public void detach(){}
    public void notifyCollaboration(Customer a)
    {
       for(Observer obj:observers)
       {
           obj.update(a);
       }
    }
}
