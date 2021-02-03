// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null ||nums.length<3){
            return new ArrayList<>();
        }
        
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            if(i!=0&&nums[i-1]==nums[i]){
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            //we are keeping two pointers for finding the right element in remaining sorted array of length(right - left)
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                //if we find the sum as 0 then we are increasing left and decreasing right 
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                    //if the duplicate elements are present in the subarray we will skip those by below two while loops
                    while(left<right && nums[left-1]==nums[left]){
                        left++;
                    }
                    
                    while(left<right && nums[right+1]==nums[right]){
                        right--;
                    }
                }else if(sum<0){
                    //if sum is less than zero that means we have to increase the left pointer bcoz if we decrease the 
                    //right pointer then the sum would go more negative
                    left++;
                    //for duplicates
                    while(left<right && nums[left-1]==nums[left]){
                        left++;
                    }
                }else {
                    //if sum is greater than zero that means we have to decrease the right pointer bcoz if we increase the 
                    //left pointer then the sum would go more positive
                    right--;
                    //for duplicates
                    while(left<right && nums[right+1]==nums[right]){
                        right--;
                    }
                }
            }
        }
        
        return list;
    }
}