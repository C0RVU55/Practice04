package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		// 문제1
		
		int[] intArray=new int[5];
		intArray[0]=3;
		intArray[1]=7;
		intArray[2]=12;
		
		int result=0;
		
		/*오류 : i<=intArray.length는 5인데 i초기값이 0이라 총 6번 돌게 돼서 오류남.
		for(int i=0; i<=intArray.length; i++) */
		
		for(int i=0; i<intArray.length; i++) {
			result=result+intArray[i];
		}
			
		
		System.out.println(result);

	}

}
