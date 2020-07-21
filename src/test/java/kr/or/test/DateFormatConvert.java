package kr.or.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatConvert {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy년 MM월 E요일 HH시 mm분");
		System.out.println("현제 날짜와 시간은" + sdf.format(now) + "입니다. ");
	}

}
