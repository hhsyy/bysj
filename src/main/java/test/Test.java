package test;

import java.security.MessageDigest;
import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		Date date = new Date();
		long userid = date.getTime();
		System.out.println(userid);
	     
	}
}
