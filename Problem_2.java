// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

//15. 3Sum
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n - 1; i++){
            //when all elements are positive
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int low = i + 1;
            int high = n - 1;
            while(low < high){
                int sum = nums[low] + nums[i] + nums[high];
                if(sum == 0){
                    List<Integer> a = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(a);
                    low++;
                    high--;
                    while(low < high && nums[low] == nums[low - 1]){
                        low++;
                    }
                    while(low < high && nums[high] == nums[high + 1]){
                        high--;
                    }
                }
                else if(sum < 0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return result;
    }
}