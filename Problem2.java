//3 Sum
// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
//3 pointers, low, high & curr(i)
// we use a for loop to travers each element and then run two sum in remaining element to check the 3sum. 
// if we have sum < 0 , update left pointer, if we have sum >0, update right ppointer.
//for checking duplicate, while loop, & increase low pointer till we get different element

import java.util.*;
public class Problem2 {
    public static void main(String[] args){
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
        //-4, -1, -1,0, 1, 2 
    
    }
    //return all triplet which has sum 0
    public static List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            int low = i + 1, high = nums.length - 1;
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    while(low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }
                }
                else if(sum < 0) {
                    low++;
                }
                else {
                    high--;
                }
            }
        }
        return result;
    }
    
}
