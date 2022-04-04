package MethodExample;

public class TestCalculator {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		cal.x=100;
		cal.y=200;
		cal.sum1();
		int result=cal.sum2();
		System.out.println("store in result and print "+result);
		System.out.println("call directly from sout "+cal.sum2());
		int sum=cal.sum3(20, 25);
		System.out.println(sum);
		System.out.println(cal.sum3(45,30));
		cal.sum(12.55f, 13);
		cal.sum(10, 30);
		cal.sum(10, 30, 40);
		cal.sum(13, 13.66f);

	}

}
