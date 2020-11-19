package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// 문제7 금액 입력 및 분류
		
		int won;
		
		int[] wonArray=new int[10];
		
		wonArray[0]=50000;
		wonArray[1]=10000;
		wonArray[2]=5000;
		wonArray[3]=1000;
		wonArray[4]=500;
		wonArray[5]=100;
		wonArray[6]=50;
		wonArray[7]=10;
		wonArray[8]=5;
		wonArray[9]=1;
		
		int[] count=new int[] {0,0,0,0,0,0,0,0,0,0};
		
		String[] wonString=new String[] {"50000원","10000원","5000원","1000원","500원","100원","50원","10원","5원","1원"};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("금액: ");
		won=sc.nextInt();
		
		while(true) {
			if(won>=wonArray[0]) {
				count[0]++;
				won=won-wonArray[0];
			}else if(won>=wonArray[1]) {
				count[1]++;
				won=won-wonArray[1];
			}else if(won>=wonArray[2]) {
				count[2]++;
				won=won-wonArray[2];
			}else if(won>=wonArray[3]) {
				count[3]++;
				won=won-wonArray[3];
			}else if(won>=wonArray[4]) {
				count[4]++;
				won=won-wonArray[4];
			}else if(won>=wonArray[5]) {
				count[5]++;
				won=won-wonArray[5];
			}else if(won>=wonArray[6]) {
				count[6]++;
				won=won-wonArray[6];
			}else if(won>=wonArray[7]) {
				count[7]++;
				won=won-wonArray[7];
			}else if(won>=wonArray[8]) {
				count[8]++;
				won=won-wonArray[8];
			}else if(won>=wonArray[9]) {
				count[9]++;
				won=won-wonArray[9];
			}else {
				break;
			}
		}
		
		for(int i=0; i<count.length; i++) {
			System.out.println(wonString[i]+":"+count[i]+"개");
		}
		
		
		
		
		sc.close();
		
		
				

	}

}
