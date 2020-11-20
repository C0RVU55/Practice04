package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// 문제8
		
		//중복 없는 미니로또
		
		int[] lottoArray=new int[6];
		
		for(int i=0; i<6; i++) {
			lottoArray[i]=(int)((Math.random()*45)+1);
			
			//중복체크를 위해 반복문 1번 더 돌림.
			for(int j=0; j<i; j++) {
				if(lottoArray[i]==lottoArray[j]) {
					i--; //중복값이 있을 경우 i를 감소시켜서 반복문을 되돌림.
				}
			}
		}
		
		//최종 로또 배열 출력
		for(int i=0; i<lottoArray.length; i++) {
			System.out.print(lottoArray[i]+" ");
		}
		
		/*실패
		for(int i=0; i<6; i++) {
			lottoArray[i]=(int)((Math.random()*45)+1);
			
			if(num!=lottoArray[i]) {
				num=lottoArray[i];
			}else if(num==lottoArray[i]){
				i--; //되돌아가기
				continue;
			}
			System.out.print(num+" ");
		
		}
		*/
		
		/* 실패
		int count=1;
		int i=0;
		
		while(true) {
			i++;
			lottoArray[i]=(int)((Math.random()*45)+1);
			
			if(num!=lottoArray[i]) {
				count++;
				num=lottoArray[i];
				System.out.print(lottoArray[i]+" ");
			}else if(num==lottoArray[i]){
				--i;

			}else if(count==6) {
				break;
			}
		}
		*/
		
		

	}

}
