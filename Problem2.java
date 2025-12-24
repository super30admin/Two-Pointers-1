/*
15. 3Sum
Ran on leetcode: Yes
TC: O(n^2) SC: O(1)
Sort the array, fix one pointer and apply two sum on the subarray to find the target. In two sum if the sum > 0 then move the second pointer to get lower value and if sum < 0 move the first pointer to get higher value item. Increment fixed pointer and apply two sum again.
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Sort, to use two pointers to find the target
        Arrays.sort(nums);

        // Fix first pointer and two pointers on rest of array
        int low = 1;
        int high = nums.length - 1;

        for (int i = 0; i < nums.length; i++) { // Fix one element
            if (i != 0 && nums[i] == nums[i - 1]){
                continue;
            }
            if(nums[i] > 0) break; // Early termination if the element is positive, cauz the other two elements will be also positive and never sum to 0
            low = i + 1; // First pointer on the subarray
            high = nums.length - 1; // Second pointer on last element 
            while (low < high) { // Find the target based on rest of the subarray
                int sum = nums[low] + nums[high] + nums[i];
                if (sum == 0) { // If target is found add to result and move both pointers
                    result.add(List.of(
                            nums[low],
                            nums[high],
                            nums[i]));
                    low++;
                    high--;
                    while (low < high && nums[high] == nums[high + 1]) {  // Skip duplicates
                        high--;
                    }
                    while (low < high && nums[low] == nums[low - 1]) { // Skip duplicates
                        low++;
                    }
                } else if (sum > 0) {
                    high--; // If sum is more than target, move pointer to get lower value
                    while (low < high && nums[high] == nums[high + 1]) { // Skip duplicates
                        high--;
                    }
                } else {
                    low++; // If sum is less than target, move pointer to get higher value
                    while (low < high && nums[low] == nums[low - 1]) {  // Skip duplicates
                        low++;
                    }
                }
            }
        }

        return result;
    }
}