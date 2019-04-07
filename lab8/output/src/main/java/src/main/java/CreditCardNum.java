/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	private SpaceDecorator decorator;

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else
		{
			//if (number.length()%4==2)
						decorator=new SpaceDecorator();
				number=decorator.wrap(this);
			System.err.println(number);
			return "[" + number + "]" + "  " ;
		}
	}	

	public void key(String ch, int cnt) {
    	//int temp= Integer.parseInt(ch);
		if ( cnt <= 16&&!ch.equals("x") )
			number += ch ;
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}

	@Override
	public void backspace(int cnt) {
		if (cnt<=16){
			decorator=new SpaceDecorator();
			number=number.replaceAll(" ","");
			number=number.substring(0,number.length()-1);
			number=decorator.wrap(this);
		}


	}

	public void addSubComponent(IDisplayComponent c ) {
		return ; // do nothing
	}

	public String getNumber() {
		return number;
	}
}