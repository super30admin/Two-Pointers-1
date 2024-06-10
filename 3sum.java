// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>(); // creating the results array
        int n = nums.length;
        Arrays.sort(nums); // sorting -> O(nlogn)
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1]){ // to avoid duplicates, if consecutive numbers are same, avoid them - continue
                continue;
            }
            if(nums[i] > 0){
                break;
            } // no use running the code as it is sorted and if lowest number itself is larger than the required sum 
            int left = i + 1; // setting the left pointer
            int right = n - 1; // setting the right pointer
            while(left < right){ // to avoid duplicates
                int sum = nums[i] + nums[left] + nums[right]; // sum
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right])); // adding to the result
                    left++; // move right
                    right--;  // move left
                    while(left < right && nums[left] == nums[left-1]){
                        left++;  // to avoid duplicates
                    }
                    while(left < right && nums[right] == nums[right+1]){
                        right--;  // to avoid duplicates
                    }
                }else if(sum > 0){
                    right--;  // move left, as sum greater than target so go for lower numbers
                }else{
                    left++; // move right, as sum less than target so go for higher numbers
                }
            }
        }

        return result;
    }
}