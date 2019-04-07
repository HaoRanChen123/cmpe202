public class SpaceDecorator implements ISpaceDecorator {
    String s="";
    CreditCardNum num=null;
    public SpaceDecorator(){}
    @Override
    public void addspace(String s) {
        String temp=s.replaceAll(" ","");
        if (temp.length()%4==0){
            s+="  ";
    }
        this.s=s;
    }
    public String wrap(IDisplayComponent component){
       num=(CreditCardNum) component;
       s=num.getNumber();
       this.addspace(s);
    return s;
    }
}
