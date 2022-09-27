// Time Complexity : O(n^2) + O(nlogn) [sorting]
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // base case
        if (nums == null || nums.length<3) return new ArrayList<>();


        //result list of list
        List<List<Integer>> result = new ArrayList<>();
        // sort the input array
        Arrays.sort(nums);

        // Try two-pointer here
        for (int i=0; i < nums.length; i++) {
            if (i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            if (nums[i] > 0) break;
            int low = i+1;
            int high = nums.length-1;
            while (low<high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum==0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    while (low>0 && nums[low]==nums[low-1] && low<high) {
                        low++;
                    }
                    while (high<nums.length-1 && nums[high]==nums[high+1] && low<high) {
                        high--;
                    }
                } else if (sum<0) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return result;
    }
}