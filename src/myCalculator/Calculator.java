package myCalculator;

import java.util.Scanner;

public class Calculator {
	int num1 = 0;
	int num2 = 0;
	
	Calculator(){
		System.out.println("*************************");
		System.out.println("*** ���̰��� ȯ���մϴ�.    ***");
		System.out.println("*************************");	
	}
	
	String input(){
		Scanner s = new Scanner(System.in);
		System.out.println("*************************");
		System.out.print("����1 �Է� :");
		num1 = s.nextInt();
		System.out.print("����2 �Է� :");
		num2 = s.nextInt();		
		System.out.print("������ ����(+, -, *, /, %) :");
		String operator = s.next();
		
		return operator;
	}
	
	int plus(){
		return num1 + num2;
	}
	
}