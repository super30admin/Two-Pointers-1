package twoPointers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	//Time Complexity : O(n^2), where n is the length of nums
	//Space Complexity : O(n), for inner list of integers
	//Did this code successfully run on Leetcode : Yes
	//Any problem you faced while coding this : This is just a better version of the brute force
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        
        Arrays.sort(nums);
        for(int i=0; i<nums.length - 2; i++) {
            if(i == 0 || nums[i] != nums[i-1]) {
                int j = i + 1;
                int k = nums.length - 1;
                
                while(j < k) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        res.add(list);
                        
                        j++;
                        k--;
                        
                        while(j < k && nums[j] == nums[j-1])
                            j++;
                        while(j < k && nums[k] == nums[k+1])
                            k--;
                    } else if(nums[i] + nums[j] +nums[k] < 0)
                        j++;
                    else
                        k--;
                }
            }
        }
        
        return res;
    }
}
