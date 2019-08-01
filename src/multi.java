/*
  	구구단 연습 v5 배열이용
 */

import java.util.Scanner;
public class multi 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);		
		int[] result = new int[9];		// 값을 담을 배열생성
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
				for(i=0; i < result.length; i++) 
				{
					result[i] = input * (i+1); 
				}
				
				for(i=0; i< result.length; i++)
				{
					System.out.println(input +" * "+(i+1)+" = "+result[i]);
				}				
				break;
			}			
		}		
	}

}
