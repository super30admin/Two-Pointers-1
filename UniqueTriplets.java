//Problem 34 : Unique Triples : 3Sum 
// Time Complexity : O(nLogn) + O(n^3) => O(n^3)
// Space Complexity : O(1);
// Did this code successfully run on Leetcode : No, TLE
// Any problem you faced while coding this :Not able to figure out optimized solution


// Your code here along with comments explaining your approach
/*
  As sum needs to be calculated from 3 elements, so just iterated over i+(i+1)+(i+2) and if sum equals to zero then just added it to the result list.
  Note: As there are duplicate elements and result should be unique, so first I sorted the array and then if (i>0 and nums[i]==nums[i-1]), which means current element is similar to the previous one, then I skipped iteration for that index. Similar logic I wrote for j and k as well 
*/

import java.util.*;
class Solution34 {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>(); 
        if(nums==null || nums.length==0){
               return res;
        }
        
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
             if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                for(int k=j+1;k<nums.length;k++){
                    if(k>j+1 && nums[k]==nums[k-1]) continue;
                    if((nums[i]+nums[j]+nums[k])==0){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                    
                }
            }
        }
        
        return res;
    }
}