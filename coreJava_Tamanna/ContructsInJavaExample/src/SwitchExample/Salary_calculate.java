package SwitchExample;

import java.util.Scanner;

public class Salary_calculate {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int salary = scn.nextInt();
		String tax_slab="0%";
		int tax;
		if(salary<600000) {
			tax_slab="10%";
		}else if((salary>=600000) && (salary<1000000) ) {
			tax_slab="20%";
		}else if(salary>=1000000) {
			tax_slab="30%";
		}
		
		switch(tax_slab) {
			
			case "10%":
				System.out.println(salary-((salary*10)/100));
				break;
			case "20%":
				System.out.println(salary-((salary*20)/100));
				break;
			case "30%":
				System.out.println(salary-((salary*30)/100));
				break;
			 default:
				System.out.println("not under any category");
			
		}
	}

}
