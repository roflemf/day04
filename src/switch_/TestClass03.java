package switch_;

import java.util.Scanner;

public class TestClass03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		while( true ) {
			System.out.println("이름 입력");
			System.out.print(">>> : ");
			name = input.next();
			System.out.println("당신 이름 : " + name);
		}
	}
}
