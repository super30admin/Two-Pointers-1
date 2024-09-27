// Time Complexity: O(n^2)
// Space Complexity: O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int start = 0, n = nums.length - 1;
        List<List<Integer>> answers = new ArrayList<>();
        // while (start < n){
        for(start = 0; start<=n ; start++){
            int left = start + 1;
            int right = n;
            if (start > 0 && nums[start] == nums[start-1]){
                continue;
            }
            int target = -1 * nums[start];
            while (left < right){
                if (nums[left] + nums[right] == target){
                    answers.add(Arrays.asList(nums[start],nums[left],nums[right]));
                    left++;
                    while(nums[left] == nums[left-1] && left < right){
                        left++;
                    }
                }else if(nums[left] + nums[right] > target){
                    right--;
                }else{
                    left++;
                }
            }
            
        }
        
        return answers;
    }
}