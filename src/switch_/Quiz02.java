package switch_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		  2.
		 우리집, 회사 등록 후 보기
		 1. 우리집 등록
		 2. 회사 등록
		 3. 등록 보기
		 
		 3.
		 우리집 : 종로 3가
		 회사 : 단성사
		 */
		
		Scanner input = new Scanner(System.in);
		int num =0;
		String home= "", company ="";
	
		while(true) {
		System.out.println("실행하기 원하는 숫자를 선택하세요 : ");
		System.out.println("1. 우리집 등록");
		System.out.println("2. 회사 등록");
		System.out.println("3. 등록 보기");
		num = input.nextInt();
		
		switch(num){
		case 1: System.out.println(""); 
			home = input.next(); break;
		case 2: System.out.println("");
			company = input.next(); break;
		case 3: System.out.println("");
//		 	System.out.println("우리집 : "+ home + "\n 회사 : " + company + "\n"); 
		 	System.out.printf("우리집 : %s \n 회사 : %s \n\n", home, company);break;
		 	
		 
		 }
		}
		
		
		
		
		
		
		
		
		
	}

}
