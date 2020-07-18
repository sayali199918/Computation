import java.util.Scanner;

public class Sample {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int a,b,c,d,e,f,g;
		System.out.println("enter the first number");
		a=s.nextInt();
		System.out.println("enter the second number");
		b=s.nextInt();
		c=a+b;
		d=a-b;
		e=a*b;
		f=a/b;
		g=a%b;
		System.out.println("Addition is="+c);
		System.out.println("Substraction is="+d);
		System.out.println("Multiplication is="+e);
		System.out.println("Division is="+f);
		System.out.println("modules is="+g);
		
	}
}
