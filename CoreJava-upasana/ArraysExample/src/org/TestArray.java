package org;

public class TestArray {
	public static void main(String[] args) {
		//declare
		String[] names;
		//intantiate
		names=new String[5];//allocation the memory
		//initialize
		names[0]="upasana";
		names[1]="Prashant";
		names[2]="Ayush";
		names[3]="Reena";
		names[4]="Uday";
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		//enhanced for loop
		System.out.println("Enhanced for loop");
		for(String temp:names)
		{
			System.out.println(temp);
		}
		
		String[] cities= {"Mumbai","Kolkata","Bengalore","Delhi","Pune"};
		for(int i=0;i<cities.length;i++) {
			System.out.println(cities[i]);
		}
		System.out.println("Enhanced for loop");
		for(String temp:cities)
		{
			System.out.println(temp);
		}
		
		int[] nums=new int[5];
		nums[0]=100;
		nums[1]=200;
		nums[2]=300;
		nums[3]=400;
		nums[4]=500;
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("Enhanced for loop");
		for(int temp:nums)
		{
			System.out.println(temp);
		}
		
	}

}
