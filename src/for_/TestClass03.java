package for_;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*
		for(	;	; ) {
			System.out.println("test");
		}
		*/
		
		
		int i = 0;
		for ( ; i < 10 ; ) {
			System.out.println(i);
			i++;
		}
		System.out.println("=============");
		i = 0;
		for( ;  ;  ) {
			System.out.println( i );
			if( i >= 10)
				break;
			i++;
			
		}
		
	}
}
