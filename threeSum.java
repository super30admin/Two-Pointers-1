// Time Complexity : O(n^2logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int target = 0;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<n; i++){

            if(i != 0 && nums[i] == nums[i-1]) continue;

            int innerTarget = target - nums[i];

            for(int j=i+1; j<n; j++){

                if(j != i+1 && nums[j] == nums[j-1]) continue;

                int t = innerTarget - nums[j];
                int idx = binarySearch(nums, j+1, nums.length-1, t);
                if(idx != -1){
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[idx]);
                    result.add(triplet);
                }
            }
        }

        return result;
    }

    private int binarySearch(int[] nums, int low, int high, int target){

        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }

        return -1;
    }
}
