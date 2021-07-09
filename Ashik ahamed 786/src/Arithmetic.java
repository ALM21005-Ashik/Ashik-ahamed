import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of i");
		
		int i=scan.nextInt();
		
		System.out.println("Enter the value of j");
		int j= scan.nextInt();
		
		int sum=i+j;
		System.out.println("the addition i and j is:"+sum);
		
		int sub=i-j;
		System.out.println("The Substraction of i and j is:"+sub);
		
		int mul=i*j;
		System.out.println("The multiplication of i and j is:"+mul);
		
		int div=i/j;
		System.out.println("The Division of i and j is:"+div);
		
		

	}

}
