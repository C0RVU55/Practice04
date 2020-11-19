package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		// 문제8
		
		//중복 없는 미니로또
		
		int num=0;
		
		int[] lottoArray=new int[6];
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
