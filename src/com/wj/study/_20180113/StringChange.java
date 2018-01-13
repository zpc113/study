package com.wj.study._20180113;

import java.util.Arrays;

public class StringChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "sky";//在字符串池中新建，生成地址，用s1引用
		String s2 = "sky";//字符串池中已存在，直接有地址，用s2引用，则两者地址相等
		String s3 = "I love" + s1;
		// sky为常量字符串，多次出现时会被编译器优化，只创建一个对象，s1和s2相当于一个对象
		System.out.println("s1和s2内存地址相同吗？" + (s1 == s2));
		System.out.println("s1和s3内存地址相同吗？" + (s1 == s3));
		String s4 = "I love" + s1;
		//s1是变量，s4在运行时才知道具体值，所以s3和s4是不同的对象
		//反证，结论为false，而字符串内容相同，则不可能指向字符串池的地址，则指向内存地址，即省略了new String()
		System.out.println("s3和s4内存地址相同吗？" + (s3 == s4));
		
		
		String i = "学习 JAVA 编程1234";//长度都为1，空格也算
		System.out.println("字符串长度：" + i.length());
		
		char c = '编';
		System.out.println("字符编第一次出现的位置：" + i.indexOf(c));
		
		char b = 123;//对应ASCII码十进制2对应的字符
		System.out.println(b);
		
		System.out.println(i.indexOf(b));//使用 indexOf 进行字符或字符串查找时，如果匹配返回位置索引；如果没有匹配结果，返回 -1
		
		String b1 = "学";//位置从0开始//字符的索引从0开始，范围为 0 到 str.length()-1
		System.out.println(i.indexOf(b1));
		
		System.out.println("子字符串第一次出现的位置：" + i.indexOf("JAVA"));//第一个字符的位置
		
		System.out.println(i.lastIndexOf(c));
		
		System.out.println(i.lastIndexOf("12"));
		
		String[] arr = i.split(" ");
		System.out.println("将空格拆成数组：" + Arrays.toString(arr));
		
		System.out.println("获取[3,7)之间的子字符串：" + i.substring(3, 7));//不包括结尾
		//使用 substring(beginIndex , endIndex) 进行字符串截取时，包括 beginIndex 位置的字符，不包括 endIndex 位置的字符

	}

}
