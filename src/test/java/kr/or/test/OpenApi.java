package kr.or.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class OpenApi {
	
	//외부연계 메서드
	 static void serviceApi() {
		BufferedReader br = null; //HRD넷에서 전송받은 데이터를 일시저장하는 저수지와 같은역할 데이터 입출력 효율을 높이기 위해
		String urlstr = "http://www.hrd.go.kr/jsp/HRDP/HRDPO00/HRDPOA60/HRDPOA60_1.jsp?returnType=XML&"
				+"authKey=5rrqxkEOaKSvLfYrsrW2nkpV16jUAiU1&pageNum=1&pageSize=10"
				+"&srchTraStDt=20200501&srchTraEndDt=20201231&outType=1&sort=DESC&sortCol=TR_STT_DT&srchTraArea1=44";
			// hrd사이트 테스트 페이지 URL생성 
		
		try {
			URL url = new URL(urlstr);
			HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection(); //전송방식
			urlconnection.setRequestMethod("GET");
			br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"euc-kr"));
			String result = "";
			String line;
			while((line=br.readLine()) != null) { //위에 받은 InputStreamReader를 bufferReader에 한줄씩 저장한다.
				result = result + line + "\n"; //한줄씩  테이블형태로 바꾸기 위해 while문을 추가한다
			}//1부터 100까지 더하는 로직과 같음
			 //System.out.println(result);
			 String result_xmlUtils = XmlUtils.formatXml(result);
			 System.out.println(result_xmlUtils);
			 
		}catch (MalformedURLException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		Calendar cal = Calendar.getInstance(); //getinstance()메소드를 이용해서 현재 날짜와 시간 객체를 얻어온다
		System.out.println(cal.getTime()); //콘솔화면에 현재 PC시간을 표시
		
	}
	
	 public static void main(String[] args) {
		 /*//실행간격 지정 (5초)
		 int sleepSec = 5; 
		 //주기적인 작업을 위한 코딩 exec 실행가능한 클래스만듬
		 final ScheduledThreadPoolExecutor exec = new ScheduledThreadPoolExecutor(1);	 
		 exec.scheduleAtFixedRate(new Runnable() { 
			 public void run() {
				 serviceApi(); //serviceApi를 실행시켜라
			 }	
		 }, 0, sleepSec, TimeUnit.SECONDS); // exec실행할때 ','로 매개변수를준다		 
		 	//지정한 시간부터 일정 간격으로 지정한 작업(task)을 수행한다.*/
		 serviceApi(); //serviceApi를 실행시켜라
		
		
	}

}
