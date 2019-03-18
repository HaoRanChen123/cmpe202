public class On_meat_check implements Handler{
    private Handler nexthandler;
    private String message;
    @Override
    public void setNext(Handler nexthandler) {
        this.nexthandler=nexthandler;
    }

    @Override
    public String check(String s) {
        if (s.equals("make on_meat_stuff"))
        {
          return   message="->|G ONION\n"+"->|JALA Grilled";

        }else{
        if (nexthandler!=null)
        {
           message= nexthandler.check(s);
            return message;
        }

       return "";}

    }

}
