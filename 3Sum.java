// Time Complexity : sorting O(logn) + 2sum O(n2) = O(n2)
// Space Complexity : O(1) //returning list not storing it hence (1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//Using 2 pointers (2Sum) apprach solving this problem
//taking 3 points left, mid, right and assigning it to left = 0, mid = 0, right = nums.length;
//sorting array
//checking left < right
//checking if pointer i > 0 --(else can not have sum zero in sorted array)
//to avoid duplicates - checking if all 3 pointer has value similar to last one if yes then skip
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3){
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {
            if(i!= 0 && nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] > 0) {
                break;
            }
            int left = i+1;
            int right = n-1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left],nums[right]));
                    left ++;
                    right --;
                    while(left < right && nums[left] == nums[left - 1]) {
                        left ++;
                    }
                    while(left < right && nums[right] == nums[right + 1]) {
                        right --;
                    }
                    

                }
                else if(sum < 0) {
                    left++;
                }
                else {
                    right --;
                }
            }
        }
        return result;
    }
}