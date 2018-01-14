package com.wj.study._20180114;

public class StringExercise {
	/*
	 * 功能：判断 Java 文件名是否正确，判断邮箱格式是否正确。
	 * 其中：合法的文件名应该以 .java 结尾；
	 * 合法的邮箱名中至少要包含 “@” , 并要求 “@” 在 “.” 之前
	 */
	/*
	 * 参考步骤：
	 * 1、获取文件名中最后一次出现"."号的位置
	 * 2、根据"."号的位置，获取文件的后缀
	 * 3、判断"."号位置及文件后缀名
     */      

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "HelloWorld.java";
		String emailName = "123456@qq.com";
		int index = fileName.lastIndexOf(".");
		String file = fileName.substring(index+1);
		if (index > 0 && file.equals("java")){
			System.out.println("java文件名正确");
		} else {
			System.out.println("java文件名无效");
		}
		int index1 = emailName.indexOf("@");
		int index2 = emailName.indexOf(".");
		if ( index1 < index2 && index1 > 0){
			System.out.println("邮箱格式正确");
		} else {
			System.out.println("邮箱格式无效");
		}
		
		/*
		 * 功能：统计指定字符串中字符 ‘a’ 出现的次数
		 * 分析：可以通过循环遍历字符串中的每一个字符，判断是否是字符 a ，如果是，则累加统计出现的次数
		 */
		String a = "aljlkdsflkjsadjfklhasdkjlflkajdflwoiudsafhaasdasd";
		int num = 0 ;
		for (int i = 0 ; i <= a.length() - 1 ; i++){
			if (a.charAt(i) == 'a'){
				num++;
			}
		}
		System.out.println("字符a出现的次数：" + num);
		
		
		
		//java中StringBuilder类
		//创建一个空的StringBuilder对象
		StringBuilder str1 = new StringBuilder();
		//创建一个字符串"阿飘"
		StringBuilder soul = new StringBuilder("阿飘");
		System.out.println(soul);
		
		//StringBuilder的常用方法
		soul.append("晚上出现！");//在字符串后面加字符串
		soul.append(666);//在字符串后面加整数
		System.out.println("字符串长度：" + soul.length());
		System.out.println(soul);
		soul.insert(2, "在墓地，");//在字符串第三位加内容
		String soul1 = soul.toString();//转换为String类型
		System.out.println(soul1);
		
		
		/*
		 * 功能：将一个由英文字母组成的字符串转换成指定格式
		 * 从右边开始每三个字母用逗号分隔的形式。
		 */
		StringBuilder str = new StringBuilder();
		str.append("jaewkjldfxmopzdm");
		for (int i = str.length() - 3 ; i >= 0 ;i = i - 3 ){
			str.insert(i, ",");
		}
		System.out.println(str);

	}

}
