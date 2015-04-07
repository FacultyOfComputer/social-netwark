package com.FCI.SWE.Controller;

import java.util.Observable;
import java.util.Observer;
import com.FCI.SWE.Models.*;
import com.FCI.SWE.Models.MessageEntity;

public class MessageObserver implements Observer {
	private int ID;
	Conversation conv;
	public void setconv(Conversation conv){
		this.conv=conv;
		conv.attach(this);
	
	}
	public  MessageObserver(int ID)
	{
		
	this.ID=ID;
	}
	public void update() {
 String message=conv.getupdate();
 int senID= CurrentUser.getUser().getID();
 MessageEntity mes=new MessageEntity(message,senID,ID);
 mes.saveMessage();
 
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		
		
	}

}
