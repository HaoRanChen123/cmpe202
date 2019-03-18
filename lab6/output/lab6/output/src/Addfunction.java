import java.util.ArrayList;

public class Addfunction {
    public ArrayList<Handler> handlers=new ArrayList<>();
    private Handler chain;
    public void  addsubcomponent(Handler h){
        handlers.add(h);
        if (handlers.size()==1){
            chain=h;
        }else{
            Handler prev= handlers.get(handlers.size()-2);
            prev.setNext(h);
        }
    }
}
