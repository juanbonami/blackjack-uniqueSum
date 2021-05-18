package com.blackjack.uniquesum;

public class blackjack {
	
	static int twentyOne(int num1, int num2) {
		if (num1 <= 21 && num2 <= 21) {
			if (num1 >= num2) {
				return num1;
			}else {
				return num2;
			}
		}
		else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(twentyOne(21,15));
	}

}
