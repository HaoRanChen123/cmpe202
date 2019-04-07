/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	private ExpDecorator exp=null;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			exp=new ExpDecorator();
			date=exp.wrap(this);
			return "[" + date + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20  )
			date += ch ;
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}


	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

	public String getDate() {
		return date;
	}
}