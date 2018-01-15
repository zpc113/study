package com.wj.study._20180115;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStudy {
	public static void main(String[] args) throws ParseException{
		//1、 调用 SimpleDateFormat 对象的 parse() 方法时可能会出现转换异常，即 ParseException ，因此需要进行异常处理
		//2、 使用 Date 类时需要导入 java.util 包，使用 SimpleDateFormat 时需要导入 java.text 包
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd/ HH:mm");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date today = new Date();
		// 调用format()方法，将日期转换为字符串并输出
		System.out.println(sdf1.format(today));
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		// 使用parse()方法将文本转换为日期
		String d = "2018-01-15 23:05:36";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 调用parse()方法，将字符串转换为日期
		Date date = sdf.parse(d);
		System.out.println(date);
	}

}
