package kr.or.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Tire{
	public void  run( ) {  //메서드= 함수=function()
		System.out.println("일반 타이어가 굴러갑니다.");
	}
}

class SnowTire extends Tire {//상속=extends=>부모
	public void run() {
		System.out.println("스노우 타이어가 굴러갑니다.");
	}
}


public class HelloWorld {
		
	public static void main(String[] args) {
		//(page:jsp클릭변수 -1) * perPgaeNum:페이지당 보여줄 개수;
		//천장함수 사용법 1페이지, 2페이지, 3페이지
		int endPage = (int)(Math.ceil(1/10.0)*10);
		int startBno  = (1 - 1) *10; //1페이지
		System.out.println("쿼리변수 (1page -1) * perPageNum = " + startBno);
		startBno = (2 - 1) *10; //2페이지
		System.out.println("쿼리변수 (2page -1) * perPageNum = " + startBno);
		startBno = (3 - 1) *10; //3페이지
		System.out.println("쿼리변수 (3page -1) * perPageNum = " + startBno);
		System.out.println("");
		
		endPage = (int)(Math.ceil(0/10.0)*10);
		System.out.println("(0/10.0)*10 = " + endPage);
		endPage = (int)(Math.ceil(1/10.0)*10);
		System.out.println("(1/10.0)*10 = " + endPage);
		endPage = (int)(Math.ceil(2/10.0)*10);
		System.out.println("(2/10.0)*10 = " + endPage);
		endPage = (int)(Math.ceil(3/10.0)*10);
		System.out.println("(3/10.0)*10 = " + endPage);
		endPage = (int)(Math.ceil(11/10.0)*10);
		System.out.println("(11/10.0)*10 = " + endPage);
		
		
		List<String> files = new ArrayList<>();
		files.add("sample1.jpg");
		files.add("sample2.jpg");
		files.add("sample3.jpg");
		String[] filenames = new String[files.size()];
		int cnt=0;
		for(String fileName:files) {
			filenames[cnt++] = fileName;
		}
		System.out.println(filenames[0] + filenames[1] + filenames[2]);
		
		//snowTire클래스형 변수
		//new 키워드로 SnowTire() 메서드를 이용해서
		//snowTire인스턴스클래스(메모리공간할당) 실행된 상태(아래)
		SnowTire snowTire = new SnowTire(); //생성자 메서드 실행
		Tire tire = new Tire();
		tire.run();
		SnowTire tire2 = new SnowTire();
		tire2.run();	
	}
		
}

	


