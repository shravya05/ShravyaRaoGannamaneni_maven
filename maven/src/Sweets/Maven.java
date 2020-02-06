package Sweets;
import Sweets.*;
public class Maven {
public static void main(String args[])
{
	System.out.println("New year gift consists of");
	Candies c=new Candies("Candies",140,3,2);
	Cookies co=new Cookies("Cookies",160,3,3);
	Kesari k=new Kesari("Kesari",400,34,4);
	Gulabjam m=new Gulabjam("Gulabjam",350,5,5);
	Chocolates ch=new Chocolates("Chocolates",200,7,6);
	Sweets[] gift= {c,co,k,m,ch};
	for(Sweets Parameter:gift) {
		System.out.println(Parameter.toString());
	}
	int price=c.getPrice()+co.getPrice()+k.getPrice()+m.getPrice()+ch.getPrice();
	System.out.println("Price of New Year gift="+price+"$");
	int weight=c.getPrice()+co.getPrice()+k.getPrice()+m.getPrice()+ch.getPrice();
	System.out.println("weight of New Year gift="+weight+"g");
}
}
