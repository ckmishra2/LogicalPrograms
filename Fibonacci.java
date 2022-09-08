package com.Fibonacci.Fibo;

import java.util.Scanner;

public class Fibonacci 
{
	static int fiboNum(int n) {
    	if(n==1)
    	{
    		System.out.println(0+", ");
    		return 0;
    	}
    	if(n==2)
    	{
    		System.out.println(1+", ");
    		return 1;
    	}
    	System.out.print("Fibonacci series is: " + 0 +", ");
    	System.out.print(1+", ");
    	int n1=0, n2=1, n3=0;
    	for(int i=0; i<n-2; i++)
    	{
    		n3=n2+n1;
    		n1=n2;
    		n2=n3;
    		System.out.print(n3+ ", ");
    	}
    	return n3;
    }
	
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int nthTerm = fiboNum(n);
        System.out.println(n+"th term is: "+ nthTerm);
    }
    
    
}
