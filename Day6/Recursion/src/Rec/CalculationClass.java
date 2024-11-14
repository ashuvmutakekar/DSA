package Rec;

public class CalculationClass {
	public int calQuotient(int div,int divisor) {
		if(divisor==0) {
			System.out.println("Illegal argument");
			return -1;
		}
		if(div<divisor) {
			return 0;
		}
		else
		{
		  return 1+(div-calQuotient(div-divisor,divisor))	;
		  
		}
	}
	public int calRemainder(int div, int divisor) {
	    if (divisor == 0) {
	        System.out.println("Illegal argument");
	        return -1; 
	    }
	    if (div < divisor) {
	        return div; 
	    }
	    return calRemainder(div - divisor, divisor);
	}
	public int calMultiplication(int num1, int num2) {
	    if ( num2== 0||num1==0) {
	       
	        return 0; 
	    }
	    else if(num1>num2) {
	   
	    return (num1+calMultiplication(num1,num2-1));
	    }
	    else {
	    	return (num2+calMultiplication(num2,num1-1));
	    }
	}
}