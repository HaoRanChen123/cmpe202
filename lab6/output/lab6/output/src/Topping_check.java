import java.security.MessageDigest;

public class Topping_check implements Handler {

    private String job="make toping";
    private Handler nexthandler;
    private String message;
    public String check(String s){
        if (s.equals("make toping")){
           return message="LETTUCE \n"+"TOMATO";
        }else{
            if (nexthandler!=null){
               message= nexthandler.check(s);
                return message;
            }
        }
        return "";
    }
    public void setNext(Handler nexthandler){
        this.nexthandler=nexthandler;
    }

}
