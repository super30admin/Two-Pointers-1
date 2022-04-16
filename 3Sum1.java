// Time Complexity : o(n^2)
// Space Complexity : o(1)
// Did this code successully run on Leetcode : yes
// Any problem you faced while coding this : no

// here i fix one pointer ( outer ) and iterate over array while i apply two pointers over remaining array
// i make sure that edge cases are handled too
// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        //2 pointer
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            
            int left = i + 1;
            int right = nums.length - 1;
            if(i > 0 &&  nums[i] == nums[i - 1]) {
                continue;
            }
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(li);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while(left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
                else if(sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
                
            }
        }
        return result;
    }
}