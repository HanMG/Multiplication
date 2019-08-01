import java.util.Scanner;
import java.util.Scanner;
public class MultiMain {
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
				int[] result = Multi.calculate(input);
				Multi.print(result,input);
				break;
			}			
		}		
	}
}
