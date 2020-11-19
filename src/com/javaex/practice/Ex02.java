package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		// 문제2
		
		//배열 표현 방식1
		double[] doubleArray=new double[3];
		
		doubleArray[0]=6.7;
		doubleArray[1]=3.3;
		doubleArray[2]=1.2;
		
		for(int i=0; i<doubleArray.length; i++) {
			System.out.println(doubleArray[i]);
		}
		
		//배열 표현 방식2
		double[] doubleArray2=new double[] {6.7,3.3,1.2};
		
		for(int j=0; j<doubleArray2.length; j++) {
			System.out.println(doubleArray2[j]);
		}
		
		//배열 표현 방식3
		double[] doubleArray3= {6.7,3.3,1.2};
		
		for(int k=0; k<doubleArray3.length; k++) {
			System.out.println(doubleArray3[k]);
		}

	}

}
