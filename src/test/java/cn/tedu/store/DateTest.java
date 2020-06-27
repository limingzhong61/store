package cn.tedu.store;

import java.util.Date;

public class DateTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.getMonth());
		System.out.println(now.getTime());
	}
	
}
