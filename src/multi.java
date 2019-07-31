/*
  	구구단 연습 v2 입력받는 버전
 */

import java.util.Scanner;
public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = 0; // 입력받을 압자리
		int b = 0; // 뒷자리				
		System.out.println("Enter the number");
		input = scan.nextInt();
		
		for(b=1; b<10; b++) 
		{
			System.out.println(input+" * "+b+" = "+input*b); 
		}		
	}

}
