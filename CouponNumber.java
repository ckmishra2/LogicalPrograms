package com.logicalprogram.all;

import java.util.Scanner;

public class CouponNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre a number");
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int n = sc.nextInt();
		int i = 0;
		while(i<n) {
		int random=(int) (Math.random()*1000000000);	
		StringBuffer sb=new StringBuffer();
		i++;
		
		
		while (random>0)
		{
			sb.append(chars[random % chars.length]);
			random /= chars.length;
		}

		String couponCode=sb.toString();
		System.out.println("Coupon Code: "+couponCode);
		sb.append(chars[random % chars.length]);
		sb.append(random);
	}
	}
}


