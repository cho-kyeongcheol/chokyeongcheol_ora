package kr.or.test;

import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		};
		
		 int cnt = 1;
		while(cnt<=100) {		
			sum = sum + cnt;
			cnt = cnt + 1;
		} 
		
		System.out.println("1 부터 100까지 합은 " + sum + " 입니다");
		
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("----------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("----------------------");
			System.out.print("위 번호를 입력해주세요> ");
			
			int menuNum = scanner.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.println("입금액을 입력해주세요");			
				balance = balance + scanner.nextInt();
				System.out.println("잔액은"+ balance + "입니다");	
				break;
			case 2:
				System.out.println("출금액을 입력해주세요");			
				balance = balance - scanner.nextInt();	
				System.out.println("잔액은"+ balance + "입니다");
				break;
			case 3:
				System.out.println("잔고는 다음과 같습니다.>");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 while문이 종료되었습니다.");
				
	}

	
}

