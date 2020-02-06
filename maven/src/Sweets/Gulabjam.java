package Sweets;

public class Gulabjam extends Sweets {
	private int GulabjamID;
	public Gulabjam(String name,int weight,int price,int GulabjamID) {
	super(name,weight,price);
	this.GulabjamID=GulabjamID;
	}
	public String toString() {
	return "ID" + GulabjamID +" :"+super.toString();
	}
}
