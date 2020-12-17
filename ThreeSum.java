// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
/*
*Sort the array, initialize i to loop through the array, lp is always i+1, hp is last element. compute sum = num[i]+ nums[lp]+nums[hp]
* when the sum = 0, adding the values to result. and increment lp and decrement hp
* when sum<0, increment lp
* when sum>0, decrement hp
* to avoid duplicate, increment lp when previous element is same as current element, decrement hp when previous element is same as current element
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum{
	
	private List<List<Integer>> getThreeSum(int[] nums){
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		
		if(nums==null) {
			return result;
		}
		Arrays.sort(nums);
		
		
		for(int i=0;i<nums.length-2;i++) {
			
			if(i>0 && nums[i]==nums[i-1]) {
				continue;
			}
			int lp=i+1, hp=nums.length-1;
			while(lp<hp) {
				int comp = nums[i] + nums[lp] +nums[hp];
				
				if(comp==0) {
					result.add(Arrays.asList(nums[i], nums[lp], nums[hp]));				
					lp++;
					hp--;
					while(lp<hp && nums[lp]==nums[lp-1]) {
						lp++;
					}
                    while(lp<hp && nums[hp]==nums[hp+1]) {
						hp--;
					}
				}
				else if(comp<0) {
					lp++;
				}
				else if(comp>0) {
					hp--;
				}
			}
			
		}
		return result;
	}	
	
	public static void main(String[] args) {
		ThreeSum ob = new ThreeSum();
		
		int[] nums= {-1,0,1,2,-2,-4};
		
		System.out.println(ob.getThreeSum(nums));
	}
}