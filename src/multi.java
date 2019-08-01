/*
  	구구단 연습 v6 메서드 이용
 */

import java.util.Scanner;

public class multi 
{
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for(int i=0; i < result.length; i++) {
			result[i] = times * (i+1);
		}
		return result;
	}
	
	public static void print(int[] result, int input) {
		for(int i=0; i < result.length; i++) {
			System.out.println(input+" * "+(i+1)+" = "+ result[i]);
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);			
		int i = 0;
		for(;;)			
		{
			System.out.printf("Enter Number: ");
			int input = scan.nextInt();
			
			if(input<1)
			{
				System.out.println("1 이상의 값을 입력해주세요!!");
			}
			else if(input>9)
			{
				System.out.println("10 미만의 값을 입력해주세요!!");
			}
			else
			{
				int[] result = calculate(input);
				print(result,input);
				break;
			}			
		}		
	}

}
