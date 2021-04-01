//3 Sum
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
//3 pointers, low, high & curr

import java.util.*;
public class Problem2 {
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
        
    
    }
    //return all triplet which has sum 0
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0;
        int lo = i+1, hi = nums.length-1;
        while(lo<hi){
            int sum = nums[i]+ nums[lo]+ nums[hi];
            //check is sum is less, greater or equal to 0
            if(sum<0){
                ++lo;
                
            }
            else if(sum >0 )
                --hi;
            else{
                res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                //check if no two element is same, 
                //increase low if there are same eleent
                while(lo<hi && nums[lo]== nums[lo-1])
                    ++lo;
            }
            
        }


        return res;
    }
    
}
