package switchExample;

public class Tax {

	public static void main(String[] args) {
		
		int tax=0;
		int sal=650000;
		if(sal<=600000)
		{
			tax=10;
		}
		else if(sal>600000 && sal<=100000)
		{
			tax=20;
		}
		else
		{
			tax=30;
		}
		switch(tax)
		{
		case 10:
			System.out.println(sal-(0.1*sal));
			break;
		case 20:
			System.out.println(sal-(0.2*sal));
			break;
		case 30:
			System.out.println(sal-(0.3*sal));
			break;
		default:
			System.out.println("No tax");
			break;
		
		     
		
		}

	}

}
