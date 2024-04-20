// Time Complexity : Sort + Binary Search - O(n2 log n )
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * Applying sorting and binary search - similar to two sum , checking the i, low and high equals to zero
 * if it is less, low++ else high--
 * if current and previosu number is skipping it to element duplicates in the result.
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;


        for(int i=0;i< n;i++) {
            int low = i+1;
            int high = n -1;
            if(i != 0 && nums[i] == nums[i-1]) {
                continue;
            }

            if(nums[i] > 0) {
                break;
            }

            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];

                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low-1]) {
                        low++;
                    }


                    while(low < high && nums[high] == nums[high+1]) {
                        high--;
                    }
                }else if(sum < 0) {
                    low++;
                    while(low < high && nums[low] == nums[low-1]) {
                        low++;
                    }
                }else{
                    high--;
                }
            }


        }
        return result;

    }
}