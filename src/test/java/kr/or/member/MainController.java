package kr.or.member;

import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;

import kr.or.member.MemberService;

public class MainController {
	
	private static final String TIME_SERVER = "pool.ntp.org";
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("------------------------------------");
		System.out.println("클래스를 사용한 사용자정의 자료형 소스");
		 
        // 클래스 연습: 사용자 정의 자료형 사용하기(아래)
       
		// MemberVO 클래스를 사용하기 위해 new연산자를 이용해 객체(instance) 생성
		MemberVO m1 = new MemberVO();
		MemberVO m2 = new MemberVO();
		MemberVO m3 = new MemberVO();
		
		m1.setName("조경철");
		m1.setAge(45);
		m1.setPhoneNum("000-0000-0000");		
		
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
	
		
		/*<!-- MainControl 클래스에 아래 내용 추가하 후 에러 상황 처리하기를 이용해서 외부 라이브러리 사용방법 확인 -->*/
		System.out.println("-서버타임 출력하기-");
		NTPUDPClient timeClient = new NTPUDPClient();   
		timeClient.setDefaultTimeout(1000);
		timeClient.open();
		try {
			timeClient.open();
		} catch (SocketException e) {
			System.out.println("open매서드 실행 오류");
			e.printStackTrace();
		}
		/*finally {
			System.out.println("이부분은 성공/오류에 상관없이 항상 실행됩니다.");
		}*/
		InetAddress address = InetAddress.getByName(TIME_SERVER);
	    TimeInfo timeInfo = timeClient.getTime(address);
	    //서버로부터 시간 가져오는 코드
	    long returnTime = timeInfo.getMessage().getTransmitTimeStamp().getTime();
	    Date date = new Date(returnTime);
	    LocalDateTime localDateTime = 
	            date.toInstant()
	            .atZone(ZoneId.systemDefault())
	            .toLocalDateTime();//date to LocalDateTime
	    
	    System.out.println("Server 시간: " + localDateTime);//서버 시간!
	    System.out.println("로컬 PC 시간: " + LocalDateTime.now());
		
		
	}

}