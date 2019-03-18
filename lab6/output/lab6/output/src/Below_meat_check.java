public class Below_meat_check implements Handler {
    private Handler nexthandler;
    private String message;
    @Override
    public String check(String s) {
    if (s.equals("below_meat_stuff")){
        return message="{{{{BACON}}}}";
    }else {
        if (nexthandler!=null){
            message=nexthandler.check(s);
            return message;
        }

    }
        return message;
    }

    @Override
    public void setNext(Handler nexthandler) {
        this.nexthandler=nexthandler;
    }
}
