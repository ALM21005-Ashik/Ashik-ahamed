import java.util.Scanner;

public class $switchstatement$ {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=scan.nextInt();
		
		switch(num%2)
		{
		case 0:{
			System.out.println("even number");
			break;
		}
		case 1:{
			System.out.println("odd number");
			break;
		}
	}

}

}