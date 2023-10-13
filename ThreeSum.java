// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class ThreeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            int n = nums.length;
            List<List<Integer>> result = new ArrayList<>();

            Arrays.sort(nums);

            for(int i = 0; i < n - 2; i++){
                int l = i + 1, r = n - 1;
                int target = 0 - nums[i];
                //preventing duplicacy in outer set
                if(i > 0 && nums[i] == nums[i - 1]) continue;
                while(l < r){
                    if(nums[l] + nums[r] == target){
                        List<Integer> list = Arrays.asList(nums[i], nums[l], nums[r]);
                        result.add(list);
                        l++;
                        r--;
                        //preventing duplicacy in inner set
                        while(l < r && nums[l] == nums[l - 1]){
                            l++;
                        }
                        while(l < r && nums[r] == nums[r + 1]){
                            r--;
                        }
                    }
                    else if(nums[l] + nums[r] < target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
            return result;
        }
    }
}
