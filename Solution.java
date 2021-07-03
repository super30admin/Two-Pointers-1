package ThreeSum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


class Solution {
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new LinkedList<>();

		Arrays.sort(nums);
		for(int i=0; i<nums.length-2; i++)
		{

			int left = i+1;
			int right = nums.length - 1;

			while(left<right)
			{
			
				if((nums[i] +nums[left]+ nums[right])== 0)
				{
					
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));
					break;
				}else if((nums[i] +nums[left]+ nums[right]) < 0){
					
					left++;
				}else{ 
					
					right--;
				}

			}	


		}


		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {-1, 0, 1, 2, -1, -4};
//		int target = 9;
		
//		Two_Sum obj = new Two_Sum();
		 
//		System.out.println(threeSum(arr));
		List<List<Integer>> abc = threeSum(arr);
		for(int i =0 ; i<abc.size();i++) {
			System.out.println(abc.get(i));
		}
		
		
		

	}
}