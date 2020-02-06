package Sweets;

public class Kesari extends Sweets {
	private int KesariID;
	public Kesari(String name,int weight,int price,int ChocolatesID) {
	super(name,weight,price);
	this.KesariID=ChocolatesID;
	}
	public String toString() {
	return "ID" + KesariID +" :"+super.toString();
	}
}
