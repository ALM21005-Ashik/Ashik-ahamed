import java.util.Scanner;

public class $switch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of a");
			
		int a=scan.nextInt();
		
		if (a % 2 != 0)
		{
			System.out.println("odd number");
		}
			
			else {
				System.out.println("even number");
			}
	}
	
}