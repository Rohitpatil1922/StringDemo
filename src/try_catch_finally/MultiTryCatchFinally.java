package try_catch_finally;

import java.util.Scanner;

public class MultiTryCatchFinally {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x,y,z = 0;
		
		System.out.println("Enter Any Two Number");
		
		x = sc.nextInt();
		
		y = sc.nextInt();
		
		try {
			
			z = x / y;
		} catch (ArithmeticException e) {
			System.out.println("Can't Devide By zero");
		
		}finally {
			 System.out.println("Value is :"+z);
		}
		
		int a, b, c = 0;
		System.out.println("Enter Any Two Number :");
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		try {
			 c = a / b;
		}catch (Exception e) {
			System.out.println("Can't Devide By zero");
			
		}finally {
			System.out.println("Value is :"+c);
		}
	}

}
