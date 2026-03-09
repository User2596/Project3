package com.git;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Driver {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Interest Rate Calculator: ");
		System.out.println();
		
		System.out.print("Enter the amount of capital invested: ");
		String amount = sc.next();
		System.out.print("Enter the interest rate: ");
		String rate = sc.next();
		System.out.print("Enter year: ");
		int period = sc.nextInt();
		
		System.out.print("Amount after "+period+" years: ");
		System.out.println(interestAmount(amount, rate, period));
	}

	public static BigDecimal interestAmount(String amount, String rate, int period) {
		BigDecimal p = new BigDecimal(amount);
		BigDecimal r = new BigDecimal(rate);
		r = r.divide(new BigDecimal("100"));
		r = r.add(BigDecimal.ONE);
		r = r.pow(period);
		p = p.multiply(r);
		return p.setScale(2, RoundingMode.HALF_EVEN);
	}
	
}
