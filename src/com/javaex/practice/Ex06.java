package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		// 문제6
		
		//문자열 공백 --> ,로 변경
		
		char[] c= {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		for(int i=0; i<c.length; i++) {
			if(c[i]==' ') {
				c[i]=',';
			}
			System.out.print(c[i]);
		}
		//System.out.println(c); 숫자, 문자열 들어간 배열은 이렇게 하면 출력 안 되는데 char형 배열은 출력됨.
		
		
		
	}

}
