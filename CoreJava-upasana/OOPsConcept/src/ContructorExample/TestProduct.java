package ContructorExample;

public class TestProduct {

	public static void main(String[] args) {
		Product p1=new Product();
		p1.name="mobile";
		p1.brand="Oneplus";
		p1.price=20000;
		p1.qty=100;
		
		Product p2=new Product("Tripod","Digitech",0,5);
		System.out.println(p2.name);
		//Product p3=new Product("camera","Nikon",60000,3);
		//Product p4=new Product("TV","Apple",300000,3);
		//Product p5=new Product("Lipstick","Lakme",300,5);
		Product p6=new Product("Nailpolish","Revlon");
		p6.price=6;
		System.out.println(p6.price);
		

	}

}
