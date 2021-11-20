package tap.Geek;
import java.util.Scanner;
public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		int a=sc.nextInt();
		System.out.println("Enter the Second number");
		int b=sc.nextInt();
		operation(a,b);
	}
	
	static void operation(int a,int b) {
		int c;
		c=a+b;
		System.out.println(c);
		c=a-b;
		System.out.println(c);
		c=a*b;
		System.out.println(c);
		c=a/b;
		System.out.println(c);
	}
}
