package myCalculator;

import java.util.Scanner;

public class Calculator {
	int num1 = 0;
	int num2 = 0;
	
	Calculator(){
		System.out.println("*************************");
		System.out.println("*** 마이계산기 환영합니다.    ***");
		System.out.println("*************************");	
	}
	
	String input(){
		Scanner s = new Scanner(System.in);
		System.out.println("*************************");
		System.out.print("숫자1 입력 :");
		num1 = s.nextInt();
		System.out.print("숫자2 입력 :");
		num2 = s.nextInt();		
		System.out.print("연산자 선택(+, -, *, /, %) :");
		String operator = s.next();
		
		return operator;
	}
	
	int plus(){
		return num1 + num2;
	}
	
}