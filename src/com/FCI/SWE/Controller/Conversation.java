package com.FCI.SWE.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Conversation extends Observable {
	private String message;
	 private List  <MessageObserver >observers;
	 public Conversation()
	 {
		 this.observers=new ArrayList<MessageObserver >();
	 }
public void setstate(String message)
{
	this.message=message;
	notifyAllObs();

}
public void notifyAllObs()
{
	for(MessageObserver  obs :observers){
		obs.update();
	}
	
}
public String getupdate()
{
	return message;
}
public void attach(MessageObserver  o)
{
	observers.add(o);
}
public void dattach(MessageObserver  o)
{
	observers.remove(o);
}
    }

