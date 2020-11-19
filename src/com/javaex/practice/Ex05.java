package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// 문제5
		
		//5개 숫자 입력받아 평균 구하기
		
		int[] data=new int[5];
		int num;
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0; i<data.length; i++) {
			num=sc.nextInt();
			data[i]=num;
			sum=sum+data[i];
			/*처음에 배열 위치 지정하는 거 헷갈려서 sum=sum+data[num]만 넣었는데
			 *각 배열 위치 data[i]에 num값을 먼저 넣은 다음 합계에 data[i]을 더하는 거였음.*/
			 
		}
		System.out.println("평균은 "+(double)(sum/data.length)+"입니다.");
		
		
		
		
		sc.close();

	}

}
