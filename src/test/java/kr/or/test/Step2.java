package kr.or.test;


public class Step2 {

	public static void main(String[] args) { //메인메서드
		// TODO Auto-generated method stub
		System.out.println("------------------------------------");
		System.out.println("클래스를 사용한 사용자정의 자료형 소스");
		 
        // 클래스 연습: 사용자 정의 자료형 사용하기(아래)
       
		// MemberVO 클래스를 사용하기 위해 new연산자를 이용해 객체(instance) 생성
		MemberVO m1 = new MemberVO();
		MemberVO m2 = new MemberVO();
		MemberVO m3 = new MemberVO();
		
		m1.setName("조경철"); //이름변수입력
		m1.setAge(45); //나이변수입력
		m1.setPhoneNum("000-0000-0000"); //전화번호 변수 입력		
		
		m2.setName("조경철");
		m2.setAge(100);
		m2.setPhoneNum("111-1111-1111");

		
		m3.setName("조경철");
		m3.setAge(3);
		m3.setPhoneNum("222-2222-2222");
		
		/*System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());*/
		
		MemberVO[] members = new MemberVO[3];
		// MemberVO배열클래스에 각각의 객체(instance) m1, m2, m3를 넣어준다.
		members[0] = m1;
		members[1] = m2;
		members[2] = m3;
		//출력:MemberService 클래스 사용
		MemberService ms = new MemberService();		
		ms.printMembers(members); // 매개변수로 사용자정의자료형인 MemberVO배열을 넘겨준다.
	
	}
	
}

class MemberVO {
	private String name; // memverVO클래스 안에서 name이란 스트링 변수선언
	private int age; //age란 인트 변수선언
	private String phoneNum; //phoneNum이란 스트링 변수선언
	
			
	@Override
	public String toString() {
		return "MemberVO [name=" + name + ", age=" + age + ", phoneNum=" + phoneNum + "]";
	} 
	public String getName() { //출력
		return name;
	}
	public void setName(String name) { //입력
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
}


class MemberService {
	//액션-서비스 클래스  - 출력용 메서드 작성
	//매개변수로 배열을 받아서 출력하는 형태로 작성
	public void printMembers(MemberVO[] members) {
		//배열 members에 들어있는 값을 처음부터 끝까지 차례대로 하나씩 꺼내서 선언된 변수
		for(MemberVO m : members) {
			System.out.println(m.getName());
			System.out.println(m.getAge() + "세");
			System.out.println(m.getPhoneNum());
		}
	}
}

