package com.logicalprogram.all;

import java.util.Scanner;

public class CouponNumber 
{
	public static void main(String[] args) 
	{
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		//ask user for number of characters in the coupon
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre a number of characters in coupon");
		int nch = sc.nextInt();
		//ask how many coupons user wants
		System.out.println("Entre a number coupons required");
		int ncp = sc.nextInt();
		
		int i = 0;
		while(i<ncp) {
			String couponCode="";
			//StringBuffer sb=new StringBuffer();
			i++;
			int j=0;
			while (j<nch)//generate a random index and append the character of that index to coupon code
			{
				//generate a random index for character array
				int random=(int) (Math.random()*1000 % 62);	
				couponCode+=chars[random%chars.length];
				j++;
			}	
			//String couponCode=sb.toString();
			System.out.println(i+"th Coupon Code: "+couponCode);
		}
	}
}


