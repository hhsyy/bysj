package org.itjl.fl;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class Tools {

	public static String delHtmlTag(String str){ 
	    String newstr = ""; 
	    newstr = str.replaceAll("<[.[^>]]*>","");
	    newstr = newstr.replaceAll(" ", ""); 
	    return newstr;
	}
	
	public static String getTime(Date date) {
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		String format = sd.format(date);
		return format;
	}
	
	public static String[] getArray(String[] str) {
				
		
		Set set = new TreeSet();
		for (int i = 0; i < str.length; i++) {
				set.add(str[i]);
		}
		str = (String[]) set.toArray(new String[0]);
		
		return str;	
	}
	
	public static String setSize(long size) {  
	       //获取到的size为：1705230  
	       int GB = 1024 * 1024 * 1024;//定义GB的计算常量  
	       int MB = 1024 * 1024;//定义MB的计算常量  
	       int KB = 1024;//定义KB的计算常量  
	       DecimalFormat df = new DecimalFormat("0.00");//格式化小数  
	       String resultSize = "";  
	       if (size / GB >= 1) {  
	           //如果当前Byte的值大于等于1GB  
	           resultSize = df.format(size / (float) GB) + "GB   ";  
	       } else if (size / MB >= 1) {  
	           //如果当前Byte的值大于等于1MB  
	           resultSize = df.format(size / (float) MB) + "MB   ";  
	       } else if (size / KB >= 1) {  
	           //如果当前Byte的值大于等于1KB  
	           resultSize = df.format(size / (float) KB) + "KB   ";  
	       } else {  
	           resultSize = size + "B   ";  
	       }
		return resultSize;  
	       
	   } 

}
