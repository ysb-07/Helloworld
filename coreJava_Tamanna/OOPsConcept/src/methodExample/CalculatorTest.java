package methodExample;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal= new Calculator();
		cal.x=100;
		cal.y=200;
		cal.sum1();
		
		int result=cal.sum2();
		System.out.println("store in result and print "+result);
		cal.x=400;
		cal.y=400;
		System.out.println("Call directly from SOUT "+ cal.sum2()) ;
		int sum=cal.sum3(25,24);
		System.out.println(sum);
		System.out.println(cal.sum3(45,30));
		
		cal.sum(12f,13);
		cal.sum(12.55f,13);
		cal.sum(12,13);
		cal.sum(12,13,14);
		cal.sum(12,13.66f);
		
	
	
	}

}
