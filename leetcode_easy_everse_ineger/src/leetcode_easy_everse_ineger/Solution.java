package leetcode_easy_everse_ineger;
//Given a 32-bit signed integer, reverse digits of an integer.
//32 비트 부호있는 정수가 주어지면 정수의 반대 자릿수입니다.
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test = -123;
		int result = reverse(test);
		
		System.out.println(result);

	}
	
	public static int reverse(int x) {
		String result = "";
		boolean minus =false;
		if(x < 0)
		{
			minus =true;
		}
		String temp = Integer.toString(x);
		temp = temp.replace("-", "");
		char[] tempchar = temp.toCharArray();
		for(int i = 0; i < tempchar.length ; i++)
		{
			result = tempchar[i]+result;
		}
		if(minus)
		{
			result = "-"+result;
		}
		return Integer.parseInt(result);
	        
    }

}
