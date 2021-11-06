// Time Complexity : O(n * n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No
import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> answer = new ArrayList<>();
        
        Arrays.sort(nums);
        int i = 0;
        
        while (i < nums.length-2) {
            int left = i + 1;
            int right = nums.length-1;
            
            while (left < right) {
                
                int sum = nums[i] + nums[left] + nums[right];
            
                if (sum == 0) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    
                    answer.add(triplet);
                    //Avoid duplicates for left
                    while (left < right && nums[left + 1] == nums[left]) {
                        left++;
                    }
                    //Avoid duplicates for right
                    while (left < right && nums[right - 1] == nums[right]) {
                        right--;
                    }
                    
                    left++;
                    right--;   
                } 
                else if (sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
            //Avoid duplicates for i
            while(i < nums.length-2 && nums[i + 1] == nums[i]) {
                i++;
            }
            
            i++;
        }
      return  answer; 
        
    }
}