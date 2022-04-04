package ConstrutorExample;

public class TestProduct {
	public static void main(String[] args) {
	Product p1=new Product();
	p1.name="Plate";
	p1.brand="Nova";
	p1.price=200;
	p1.qty=50;
	
	Product p2=new Product("Tripod","Digitech",0,5);
	System.out.println(p2.name);
	Product p3=new Product("Camera","Nikon",4000,3);
	Product p4=new Product("TV","Apple",320,2);
	Product p5=new Product("Lipstick","Lakme",300,5);
	Product p6=new Product("Nailpolish","Revlon");
	p6.price=6;
	System.out.println(p6.price);
	
	
	
	}

}
