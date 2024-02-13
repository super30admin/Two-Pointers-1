// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

public class Solution {
    public IList<IList<int>> ThreeSum(int[] nums) {
        IList<IList<int>> result = new List<IList<int>>();
        Array.Sort(nums); // Sort the array
        for(int i = 0; i < nums.Length; i++) {
            // If the current number is already processed then continue until a different number is found
            if(i != 0 && nums[i] == nums[i-1])
                continue;
            // In the sorted array, if the number being processed is greater than zero, then we will not find
            // any combination with the rest of the array to be iterated whose sum is equal to zero. 
            if(nums[i] > 0)
                break;
            // Using 2 sum approach to find second and third number. 
            int low = i+1;
            int high = nums.Length - 1;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                    result.Add(new List<int>{nums[i], nums[low], nums[high]});
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low - 1]) {
                        low++;
                    } 
                    while(low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }
                }
                else if(sum > 0) {
                    high--;
                }
                else {
                    low++;
                }
            }
        }
        return result;
    }
}