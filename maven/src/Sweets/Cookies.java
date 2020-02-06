package Sweets;

public class Cookies extends Sweets {
	private int CookiesID;
	public Cookies(String name,int weight,int price,int CokkiesID) {
	super(name,weight,price);
	this.CookiesID=CookiesID;
	}
	public String toString() {
	return "ID" + CookiesID +" :"+super.toString();
	}
}
