class Solution {
    // Time complexity : O(n^2)
    // Space Complexity : O(1)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

    Arrays.sort(nums);

    for (int i =0; i < nums.length;i++){
        if (i > 0 && nums[i] == nums[i-1]){
         continue;
        }
        int left = i+1;
        int right = nums.length -1;
        while (left< right){
            if (nums[i] + nums[left] + nums[right] == 0 ){
                res .add (new ArrayList<Integer>(Arrays.asList(nums[i],nums[left], nums[right])));
                left ++;
                while (left < right && nums[left] == nums[left-1])
                left++;
                right --;
            } else if (nums[i] + nums[left] + nums[right] > 0){
                right --;
            } else {
                left ++;
            }
        }
    }
    return res;
    }
}
