public class SpaceDecorator implements ISpaceDecorator {
    String s="";
    CreditCardNum num=null;
    public SpaceDecorator(){}
    @Override
    public void addspace(String s) {
       s=s.replaceAll(" ","");
      char[] array=s.toCharArray();
      String temp="";
      for (int i=0;i<array.length;i++){
          if (i%4==0&&i>0){
              temp+=" ";
          }
          temp+=array[i];
      }
    this.s=temp;

    }
    public String wrap(IDisplayComponent component){
       num=(CreditCardNum) component;
       s=num.getNumber();
        System.err.println(s);
       this.addspace(s);
    return s;
    }
}
