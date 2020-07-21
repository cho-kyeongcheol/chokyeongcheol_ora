package kr.or.member;

public class MemberService {
	//액션-서비스 클래스  - 출력용 메서드 작성
		//매개변수로 배열을 받아서 출력하는 형태로 작성
		public void printMembers(MemberVO[] members) {
			//배열 members에 들어있는 값을 처음부터 끝까지 차례대로 하나씩 꺼내서 선언된 변수
			for(MemberVO m : members) { //m1,m2,m3
				System.out.println(m.getName());
				System.out.println(m.getAge() + "세");
				System.out.println(m.getPhoneNum());
			}
		}

}
