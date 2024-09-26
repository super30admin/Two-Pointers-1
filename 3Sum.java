// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res= new ArrayList<List<Integer>>();
    for (int i=0;i<nums.length-2;i++){
        for(int j=i+1;j<nums.length-1;j++){
            for(int k=j+1;k<nums.length;k++){
                if(nums[i]+nums[j]+nums[k]==0){
                   ArrayList<Integer> subset=new ArrayList<Integer>();
                    subset.add(nums[i]);
                     subset.add(nums[j]);
                     subset.add(nums[k]);
                    Collections.sort(subset);                   
                    if(!res.contains(subset)){
                        res.add(subset);
                    }
                }                
            }
        }
    }
      return res;  
    }
}
// Your code here along with comments explaining your approach