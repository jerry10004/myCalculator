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
				System.out.println("�߸� �Է��ϼ̾��");
				continue;
			}
			System.out.printf("����� %d �Դϴ�.\n", result);
			
			System.out.print("����Ͻðھ��?(N - ����)");
			String continueStr = s.next(); 
			if(continueStr.equalsIgnoreCase("n")) break;
			System.out.println("\n");
		}
		
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}

}
