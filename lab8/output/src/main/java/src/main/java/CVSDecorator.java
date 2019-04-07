public class CVSDecorator implements ISpaceDecorator {
    String s="";
    CreditCardCVC cvs=null;


    @Override
    public void addspace(String s) {

    }

    @Override
    public String wrap(IDisplayComponent component) {
        cvs=(CreditCardCVC)component;
        return null;
    }
}
