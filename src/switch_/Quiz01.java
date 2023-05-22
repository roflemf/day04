package switch_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		/*
		 1. 
		 날짜 입력받아 1일이면 '월'
		 2일이면 '화'...7일 '일' 8일 '월' 숫자에 맞춰 요일을 출력
		 

		 */
		
		Scanner input = new Scanner(System.in);
		int date;
		System.out.println("날짜 입력 : ");
		date = input.nextInt();
		
		while (date > 7) {
			date -= 7;
		}
		switch (date) {
		
			case 1 : System.out.println("월"); break;
			case 2 : System.out.println("화"); break;
			case 3 : System.out.println("수"); break;
			case 4 : System.out.println("목"); break;
			case 5 : System.out.println("금"); break;
			case 6 : System.out.println("토"); break;
			case 7 : System.out.println("일"); break;
			
		
		}
		
////		 선생님 답
//		
//		Scanner input = new Scanner(System.in);
//		int num;
//		System.out.print("날짜 입력 : ");
//		num = input.nextInt();
//		switch(num%7){
//		case 1:System.out.println(num+":월요일");break;
//		case 2:System.out.println(num+"화요일");break;
//		case 3:System.out.println(num+":수요일");break;
//		case 4:System.out.println(num+"목요일");break;
//		case 5:System.out.println(num+":금요일");break;
//		case 6:System.out.println(num+"토요일");break;
//		case 0:System.out.println(num+":일요일");break;
//		}
		
		
	}

}
