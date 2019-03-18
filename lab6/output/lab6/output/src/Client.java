
public class Client {
    public static void main(String[] args){
        String out="";


      Title title=new Title();
      Display display=new Display(title,out );
      display.displaytitle(title.getTitle());
      display.combine();
      DisplaySlip d=new DisplaySlip();

    }

}
