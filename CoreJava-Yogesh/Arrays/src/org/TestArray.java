package org;

public class TestArray {

	public static void main(String[] args) {
		//declare
		String[] names;
		//instantiate
		names=new String[5]; //allocation of memory
		//initialize
		names[0]="Ram";
		names[1]="Shyam";
		names[2]="Rahul";
		names[3]="Rohan";
		names[4]="Ronit";
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
		//enhanced for loop
		System.out.println("Enhanced for loop");
		for(String temp:names)
		{
			System.out.println(temp);
		}
		
		String[] cities= {"Mumbai", "Kolkata", "Bangalore", "Delhi", "Lucknow"};
		for(int i=0;i<cities.length;i++)
		{
			System.out.println(cities[i]);
		}
		int[] nums=new int[5];
		nums[0]=100;
		nums[1]=200;
		nums[2]=300;
		nums[3]=400;
		nums[4]=500;
		for(int i=0;i<nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		//enhanced for loop
				System.out.println("Enhanced for loop");
				for(int temp:nums)
				{
					System.out.println(temp);
				}
	}

}
