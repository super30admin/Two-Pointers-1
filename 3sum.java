import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        //base case to check if the array is empty
        if(nums == null || nums.length == 0)
            return new ArrayList<List<Integer>>();
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){

            //i holds the pivot value so the left is i + 1
            int left = i + 1, right = nums.length - 1;
            
            //checking for positive value
            if(nums[i] > 0) break;
            
            //checking if the value of i is same as before
            if(i != 0 && nums[i] == nums[i - 1]){
                continue;
            }

            //base condition if the left and right are same then we stop
            while(left < right){

                //calculate the sum of the 3 vars
                int currSum = nums[i] + nums[left] + nums[right];
                
                //if sum is negative we need to move the left pointer ahead
                if(currSum < 0){
                    left++;
                }
                //if the sum is positive then we move the right pointer below
                else if(currSum > 0){
                    right--;
                }
                //sum is 0 means we found a pair
                else{
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    
                    while(left < right && nums[left] == nums[left - 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]){
                        right--;
                    }
                }
            }
        }
        return result;
    }
}