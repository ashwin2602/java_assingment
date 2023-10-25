import java.util.Scanner;

public class Menu 
{
	public static void main(String[] args) 
	{
		int choice;
		System.out.println("Enter Choice");
		System.out.println("0.Exit");
		System.out.println("1.Dosa = 99 Rs");
		System.out.println("2.Samos = 70 Rs ");
		System.out.println("3.Idli = 50 Rs");
		System.out.println("4.Pizza = 240 Rs");
		System.out.println("5.Momos = 120 Rs");
		System.out.println("6.Wada Sambhar = 70 Rs");
		System.out.println("7.Rava Dosa = 100 Rs");
		System.out.println("8.Panner Chilli = 280 RS");
		System.out.println("9.Poha  = 40 Rs");
		System.out.println("10.Generate Bill");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		int a=99,b=70,c=50,d=240,e=120,f=70,g=100,h=280,i=40,bill=0,qty;
		
		switch (choice) {
		case 0:
			System.out.println("Bye......");
			break;
		case 1:
			System.out.println("Enter Quantity");
			qty=sc.nextInt();
			bill = qty*a;
			break;
		case 2:
			System.out.println("Enter Quantity");
			qty=sc.nextInt();
			bill = qty*b;
			
			break;
		case 3:
			System.out.println("Enter Quantity");
			qty=sc.nextInt();
			bill = qty*c;
						
			break;
		case 4:
			System.out.println("Enter Quantity");
			qty=sc.nextInt();
			bill = qty*d;
			
			break;
		case 5:
			System.out.println("Enter Quantity");
			qty=sc.nextInt();
			bill = qty*e;
			break;
		case 6:
			System.out.println("Enter Quantity");
			qty=sc.nextInt();
			bill = qty*f;
			break;
		case 7:
			System.out.println("Enter Quantity");
			qty=sc.nextInt();
			bill = qty*g;
			break;
		case 8:
			System.out.println("Enter Quantity");
			qty=sc.nextInt();
			bill = qty*h;
			break;
		
		case 9:
			System.out.println("Enter Quantity");
			qty=sc.nextInt();
			bill = qty*i;
			break;

		default:
			System.out.println("Wrong Choice");

			break;
		}
		System.out.println("bill is "+bill);
		
		
	}
}
