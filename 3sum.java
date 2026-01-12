// Time Complexity :O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english : We sort the array to make it easier to avoid duplicates and use the two-pointer technique. For each element, it sets two pointers (left and right) and moves them toward each other to find pairs that sum with the current element to zero. It skips duplicate elements to ensure each triplet is unique. All valid triplets are added to a list, which is returned at the end.


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length<3) new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();


        for(int i=0; i<nums.length-2; i++) {
            if(nums[i] > 0) break;
            if(i>0 && nums[i] == nums[i-1]) {
                    continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while(left<right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    output.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left ++;
                    right --;
                    while(left<right && nums[left] == nums[left-1]) left++;
                    while(left<right && nums[right] == nums[right+1]) right--;

                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return output;
    }
}
