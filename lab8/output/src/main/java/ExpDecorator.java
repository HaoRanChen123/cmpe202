import javax.security.sasl.SaslServer;

public class ExpDecorator implements ISpaceDecorator {

    private String ss="";
    private CreditCardExp exp=null;
    @Override
    public void addspace(String s) {
        //String month=s.substring(0,2);

        if (s.length()==2){
            s+="/";
        }
       this.ss=s;
    }

    @Override
    public String wrap(IDisplayComponent component) {
        exp=(CreditCardExp)component;
        ss=exp.getDate();
        this.addspace(ss);

        return ss;
    }
}
