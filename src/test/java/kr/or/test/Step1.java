package kr.or.test;

public class Step1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("---------------");
		System.out.println("클래스를 사용하지 않는 내장변수 자료형 소스");
		//필드 field(변수)
		String name;
		int age;
		String phoneNum;
		name="홍길동";
		age= 45;
		phoneNum = "000-0000-0000";		
		printMember(name, age, phoneNum);
		
		name="성춘향";
		age= 100;
		phoneNum = "111-1111-1111";	
		printMember(name, age, phoneNum);	
		
		name="각시탈";
		age= 3;
		phoneNum = "222-2222-2222";				
		printMember(name, age, phoneNum);
	
		
		System.out.println("---------------------");
		System.out.println("클래스를 사용하지 않는 내장배열 자료형 소스");
		//필드=field=배열변수
		
		String[] names = {"홍길동","성5춘향","각시탈"};
		System.out.println("현재 등록된 회원은 " + names.length  +  "명 입니다.");
		int[] ages = {45,100,3};
		String[] phoneNums = {"000-0000-0000","111-1111-1111","222-2222-2222"};
		
		printMember(names, ages, phoneNums);
		System.out.println("---------------------");
		
	}

	
	private static void printMember(String name, int age, String phoneNum) {
		// TODO Auto-generated method stub		
		System.out.println("이름은"+ name);
		System.out.println("나이는" + age + "세");
		System.out.println("전화번호는" + phoneNum);	
		
	}
	
	// 같은 이름의 메서드 인데 파라미터(매개변수)가 틀리게 만든 메서드를 오버로딩이라고 함.
		private static void printMember(String[] names, int[] ages, String[] phoneNums) {
			// TODO Auto-generated method stub
			for(int cnt =0; cnt<3; cnt++) {
			System.out.println("이름은"+ names[cnt]);
			System.out.println("나이는" + ages[cnt] + "세");
			System.out.println("전화번호는" + phoneNums[cnt]);
		}
		
	}
	
}