package Sweets;

public class Candies extends Sweets {
	private int CandiesID;
public Candies(String name,int weight,int price,int CandiesID) {
	super(name,weight,price);
	this.CandiesID=CandiesID;
}
public String toString() {
	return "ID" +CandiesID+" :"+super.toString();
}
}
