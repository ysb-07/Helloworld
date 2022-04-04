package switchExample;

public class TestSwitch {

	public static void main(String[] args) {
		String colour="red";
		switch (colour)
		{
		case "green" :
			System.out.println("You got green");
			break;
		case "blue" :
			System.out.println("You got blue");
			break;
		case "red" :
			System.out.println("You got red");
			break;
		case "yellow" :
			System.out.println("You got yellow");
			break;
		default:
			System.out.println("You got a colour we dont support");
		
		}

	}

}
