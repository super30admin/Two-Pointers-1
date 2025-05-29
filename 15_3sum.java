// Approach:
// Sort the array and fix one element at a time, then use two pointers to find pairs that sum with the fixed element to zero while skipping duplicates to avoid repeated triplets. 
// If the fixed element is positive, break early since no further triplets can sum to zero. 
// Adjust pointers based on whether the current sum is less than or greater than zero, collecting all unique triplets.

// Time Complexity: O(n²), because for each element, the two-pointer scan runs in O(n).
// Space Complexity: O(1), (output space is not considered), and O(log n) for sorting stack space.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;++i){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = n-1;
            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
                    // skip left duplicates
                    while(left < right && nums[left] == nums[left+1]) left++;
                    // skip right duplicates
                    while(left < right && nums[right] == nums[right-1]) right--;
                    // going to the correct destination
                    left++;right--;
                } else if(sum < 0){
                    left++;
                } else{
                    right--;
                }
            }   
        }
        return result;
    }
}
