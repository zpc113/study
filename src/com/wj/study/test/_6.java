package com.wj.study.test;

/**
 * 输入一个字符串和指定的行数，将字符以Z字型输出。
 * @author 和谐社会人人有责
 *
 */
public class _6 {
	public static void main(String[] args) {
		String str = "PAYPALISHIRING";
		int line = 5 ;//行数
		int num = line - 1 ;//一个√所占列数
		int sum = line * 2 - 2 ;//一个√所占字符数
		int column ;//总列数
		if (str.length()%sum <= line) {
			column = (str.length()/sum)*num + 1;
		} else {
			column = (str.length()/sum)*num + (str.length()%sum - line) + 1;
		}
		String[][] arr = new String[line][column];
		System.out.println( num + "\t" + sum + "\t" + column);
		int k = 0 ;
		int n = 0 ;
		for (int l = 0 ; l <= str.length()/sum ; l ++){
			for (int m = 0 ; m < line ; m++){
				if (k >= str.length()) {
					break;
				} else {
 				    n = num * l ;
 				    arr[m][n] = str.charAt(k) + "";
 				    k++;
				}
			}
			for (int m = line - 2; m >= 1 ; m-- ){
				if (k >= str.length()) {
					break;
				} else {
				    n++;
				    arr[m][n] = str.charAt(k) + "";
				    k++;
			    }
			}
		}
		for (int i = 0 ; i < line ; i++){
			for (int j = 0 ; j < column ; j++){
				if (arr[i][j] == null){
					arr[i][j] = " ";
				}
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		/**
		 * P A H N 
		　　APLSIIG 
		　　Y I R 
		
		   P   I   N
		   A  LS  IG
		   Y A H R
		   P   I
		 */
	}
	
}
