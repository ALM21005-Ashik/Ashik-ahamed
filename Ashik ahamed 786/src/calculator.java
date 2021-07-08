import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of i");
		
		int i=scan.nextInt();
		
		System.out.println("enter the value of j");
		int j=scan.nextInt();
		
		int sum=i+j;
		
		System.out.println("the result of i and j is:"+sum);
		

	}

}
