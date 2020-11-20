package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		// 문제3 
		
		/*결과 : 배열 intB에 intA의 주소값을 복사해서 배열값이 같음. 
		 *각 배열이 같은 메모리공간을 공유하고 있기 때문에
		 *intB의 0, 2번 자리에 20, 10을 새로 넣으면 intA도 같이 바뀌어서 {20,6,10}이 됨.*/
		
		
		int[] intA= {3,6,9};
		
		int[] intB;
		intB=intA;
		intB[0]=20;
		intB[2]=10;
		
		for(int i=0; i<intA.length; i++) {
			System.out.println(intA[i]);
		}

	}

}
