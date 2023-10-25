import java.util.Scanner;

public class DoubleNumber
{
	
public static void main(String[] args) 
{

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First Value ");
	System.out.println("Enter Second Number ");
	
	if(sc.hasNextDouble())
	{
	double num1 =	sc.nextDouble();		
	if(sc.hasNextDouble())
	{	
	double num2 = sc.nextDouble();
	double avg = (num1+num2)/2;
	System.out.println("Average = " +avg);
	}
	else 
		System.out.println("Please Enter Number 2 Double");
	}
	else
	{
	System.out.println("Please Enter Number 1 Double");	
	}
	
}
}	

