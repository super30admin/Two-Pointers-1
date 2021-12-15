// Time Complexity : O(nlogn) + O(n^2) ===> O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List <Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new ArrayList <>();
        }
        List<List<Integer>> result = new ArrayList<>();

        // sorting the array so that we can use two pointer approach
        Arrays.sort(nums);
        int low;
        int high;

        // For each element we are running two pointers to find the pair(2Sum) to have the sum as target
        for(int i = 0; i< nums.length-2; i++){
            // As the array is sorted, we need not to continue further when element is greater than 0
            if(nums[i] > 0) {
                break;
            }
            // As the current element is equal to previous one, we will skip it to avoid duplicated in final result
            if((i-1) >=0 && nums[i] == nums[i-1]) {
                continue;
            }
            low = i+1;
            high = nums.length-1;

            // Running two pointer method for each approach
            while(low<high) {
                if(nums[i] + nums[low] + nums[high] == 0){
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;

                    //When we found the ans, we need to check of the adjacent elements are not same for both low and high
                    // in order to avoid the duplicated
                    while(low<high && nums[low] == nums[low-1]) {
                        low++;
                    }
                    while((high < nums.length-1) && (low<high) && nums[high] == nums[high+1]) {
                        high--;
                    }
                } else if(nums[i] + nums[low] + nums[high] < 0) {
                    low++; // as we need to increase the total sum, so moving towards higher element
                } else {
                    high--; // as we need to decrease the total sum, so moving towards lower element
                }
            }
        }
        return result;
    }
}
