import java.util.Scanner;

public class Conversion
{

	public static void main(String[] args)
	{
	int num;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number");
	num = sc.nextInt();
	
	String n = Integer.toBinaryString(num);
	System.out.println("Binary Number ="+n);
	
	String n1 = Integer.toOctalString(num);
	System.out.println("Octal Number ="+n1);
	
	String n2 = Integer.toHexString(num);	
	System.out.println("Hexa Number ="+n2);
	}
}	
	
	 	
