package leetcode_easy_twosum;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//정수 배열들이 주어지고, 더해져서 특정 타겟에 해당하는 정수로 만드는 두개의 숫자 인덱스들을 반환한다.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//각각의 입력이 정확히 하나의 해를 가질 수 있다고 가정한다. 같은 요소를 두 번 사용할 수 없다.

public class Solution {
	public static void main(String[] args)
	{
		int[] nums = {3,2,3};
		int target = 6;
		int[] result = twoSum(nums,target);
		
		System.out.println(result);
	}
	public static int[] twoSum(int[] nums, int target){
		for(int firindex = 0; firindex < nums.length; firindex++)
		{
			for(int secindex = firindex+1; secindex < nums.length; secindex++)
			{
				if(target ==  nums[firindex]+nums[secindex])
				{
					return new int[]{firindex,secindex};
				}
			}
		}
		return null;
	}
}
