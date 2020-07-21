package kr.or.member;

public class MemberVO {
	private String name;
	private int age;
	private String phoneNum;
	
			
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
