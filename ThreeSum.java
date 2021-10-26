// Time Complexity : O(N*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	 public List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> result=new ArrayList<>();
	        Arrays.sort(nums);
	        for(int i=0;i<nums.length;i++){
	            int left=i+1;
	            int right=nums.length-1;
	            while(left<right){
	                int sum=nums[i]+nums[left]+nums[right];
	                if(sum==0){
	                    List<Integer> triplet=new ArrayList<>();
	                    triplet.add(nums[i]);
	                    triplet.add(nums[left]);
	                    triplet.add(nums[right]);
	                    result.add(triplet);
	                 
	                    while(left<nums.length-1 && nums[left]== nums[left+1]){
	                        left++;
	                        continue;
	                    }
	                    while(right>0 && nums[right-1]== nums[right]){
	                        right--;
	                        continue;
	                    }
	                    left++;
	                    right--;
	                }else if(sum<0){
	                    left++;
	                }else{
	                    right--;
	                }
	            }
	            while(i<nums.length-1 && nums[i]==nums[i+1]){
	                i++;
	            }
	            
	        }
	        return result;
	  }
}
