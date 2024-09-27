//Approach:sort the array and iterate whole array  and element at current index, next index which is startindex and end index. if sum is 0 the return element.
//if sum is greater than 0 then add number less than privious number so endIndex--. if sum is less then add next element of start index so startindex++.

//also we need to take care of edge condition that is start should be less than end and if numbers are repeating then skip those number to avoid duplicate triplets

//Time complexity of this function: O(n2)  n is length of array
//Space Complexity of this function: O(1)  not considering output array in space complexity.

//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this:yes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
		public static List<List<Integer>> threeSum(int[] nums) {
			List<List<Integer>> output = new ArrayList<>();
			   Arrays.sort(nums);
			//iterate thorugh array
			for(int i =0; i<nums.length;i++) {
				int left =i+1;
				int right = nums.length-1;
				int sum=0;
				int element = nums[i];
				
				//check left should be less than right
				while(left<right) {
					//sum of current element and next element of current and end element
					sum= element + nums[left]+nums[right];
					//check if sum is 0 then left++ and right--
					//if sum<0 then left++(it means adding grater number as array is sorted so left to right number are in asending order )
					//if sum>0 the right--(take number lesser than privious number)
					if(sum==0) {
						output.add(Arrays.asList(element,nums[left],nums[right]));
						
						//check to avoid duplicate triplets so skip duplicates number
						
						while(left+1<right && nums[left]==nums[left+1]) {
							left++;
						}
						while(right-1>left&& (nums[right]==nums[right-1])) {
							right--;
						}
						left++;
						right--;
					}else if(sum<0) {
						left++;
					}else {
						right--;
					}
				}
			}
			
			
			return output;
			
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {-2,0,0,2,2};
		List<List<Integer>> output = new ArrayList<>();
		output = threeSum(input);
		for(int i=0;i<output.size();i++)
		System.out.println("output array is whose sum is 0="+output.get(i));

	}

}
