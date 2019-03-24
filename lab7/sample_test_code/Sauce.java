public class Sauce extends LeafDecorator
{
    private String[] options ;
    
    
    public Sauce( String d )
    {
        super(d) ;
    }
    
    // 1 sauce free, extra +.75
    public void setOptions( String[] options )
    {
        this.options = options ;
        for(int i=0;i<options.length;i++)
            if(options[i].equals("Thai Peanut Sauce")){
                this.price+=0.5;
            }
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}