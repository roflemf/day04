package for_;

public class TestClass01 {
	public static void main(String[] args) {
		/*
		 반복문
		 - for (초기값 ; 조건식 ; 증감식){
		 		종속문장;
		 - 사용조건
		 	- 규칙적으로 연산이 이루어지는 경우
		 	- 동일코드가 반복된다면
		   }
		 
		 */
		
		
		
		int num = 0, sum = 0;
		for(num = 1;  num <= 10; num++  ) {
		//  초기값; 조건식	; 증감식
		// 	실행 순서 ; 초기값 -> 조건식 -> 하위 식 (sum = sum + num;) -> 중감식(num++)
			sum = sum + num;
		}
		System.out.println(sum + ", num : " + num);
		
		//num =11에서 멈춤
		
		/*
		num++; sum = sum + num;
		num++; sum = sum + num;
		num++; sum = sum + num;
		num++; sum = sum + num;
		num++; sum = sum + num;
		num++; sum = sum + num;
		num++; sum = sum + num;
		num++; sum = sum + num;
		num++; sum = sum + num;
		num++; sum = sum + num;
		System.out.println(sum);
		*/
		
	}

}
