package myCalculator;

import java.util.Scanner;

public class myCalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calulator = new Calculator();
		Scanner s = new Scanner(System.in);
		
		while(true){
			int result = 0;
			String op = calulator.input();
			if(op.equalsIgnoreCase("+")){
				result = calulator.plus();
			}					
			else{
				System.out.println("잘못 입력하셨어요");
				continue;
			}
			System.out.printf("결과는 %d 입니다.\n", result);
			
			System.out.print("계속하시겠어요?(N - 종료)");
			String continueStr = s.next(); 
			if(continueStr.equalsIgnoreCase("n")) break;
			System.out.println("\n");
		}
		
		System.out.println("프로그램이 종료되었습니다.");
	}

}
