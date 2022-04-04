package WhileDoWhile;

import java.util.Scanner;

public class IntrestWhiledoWhile {

	public static void main(String[] args) {
		
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter princle amount");
		int principle=scn.nextInt();
		System.out.println("Enter Rate of Intrest");
		int rate =scn.nextInt();
		//System.out.println("Enter number of years");
		//int years=scn.nextInt();
		System.out.println("Enter amount of Intrest you want: ");
		int wanted_intrest=scn.nextInt();
		
		int year_num;
		//year_num= (wanted_intrest*100)/(principle*rate);
		
		int years=0;
		while(wanted_intrest!=100000)
		{
			wanted_intrest=(principle*rate*years)/100;
			years++;
		}
			
			
			
		System.out.println("number of years to get intrest 100000 is "+years);
		
		//float intrest= (principle*rate*years)/100;
				//while(intrest<100000) {   }

			

	}

}
