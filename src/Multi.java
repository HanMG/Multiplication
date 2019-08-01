/*
  	구구단 연습 v7 클래스 이용
 */

public class Multi 
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

}
