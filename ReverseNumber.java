package com.logicalprogram.all;
import java.util.Scanner;
class RevNum{

	int rev(int num) {
		int reverse = 0;
		int temp = num;
		while(temp>0){
			int remaindar = temp % 10;
			reverse = reverse*10 + remaindar;
			temp=temp/10;

		}
		return reverse;
	}
}

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		RevNum a = new RevNum();
		int result = a.rev(num);
		System.out.println(result);
	}

}


