/*
  	구구단 연습 v3 값 입력 및 조건문
 */

import java.util.Scanner;
public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int input = 0; // 입력받을 압자리
		int b = 0; // 뒷자리				
		System.out.print("Enter the number ");
		input = scan.nextInt();
		if(input<1) {
			System.out.println("1 이상의 값을 입력하세요.");
		}
		else if(input>9) {
			System.out.println("9 이하의 값을 입력하세요.");
		}
		else {
			for(b=1; b<10; b++) 
			{
				System.out.println(input+" * "+b+" = "+input*b); 
			}	
		}			
	}

}
