package Rec;

import java.util.Scanner;

public class Calculation {
	

	public static void main(String[] args) {
		CalculationClass c=new CalculationClass();
		String sign="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1=sc.nextInt();
		System.out.println("Enter second number:");
		int num2=sc.nextInt();
		if(num1<0 && num2>0 ) {
			num1=num1+num1+num1;
			 sign="-";
		}
		if(num2<0 && num1>0 ) {
			num2=num2+num2+num2;
			 sign="-";
		}
		if(num1<0 && num2<0) {
			num1=num1+num1+num1;
			num2=num2+num2+num2;
			 sign="";
		}
		int res=c.calMultiplication(num1, num2);
		System.out.println("Their multiplication is: "+sign+res);
		int res2=c.calQuotient(num1,num2);
		System.out.println("Their quotient after division is: "+sign+res2);
		
		int res3=c.calQuotient(num1,num2);
		System.out.println("Their remainder after division is: "+sign+res3);
	}

}
