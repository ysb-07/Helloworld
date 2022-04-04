package ConstructorExample;

public class TestProduct {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.name="mobile";
		p1.brand="OnePlus";
		p1.price=20000;
		p1.qty=100;
		
		Product p2=new Product("Tripod","Digitech", 0, 5);
		System.out.println(p2.name);
		
		
		
		
		Product p6=new Product("Nailpolish", "Revlon");
		p6.price=6;
		System.out.println(p6.price);

	}

}
