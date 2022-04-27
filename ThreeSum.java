// Time Complexity :O(n*n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res = new ArrayList<>();

        if(nums == null || nums.length < 3) return res;

        Arrays.sort(nums);

        for(int i = 0; i < nums.length -2; i++){
            int left = i+1;
            int right = nums.length-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];

                if(sum < 0){
                    left++;
                }
                else if(sum > 0){
                    right--;
                }
                else{
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right-1]){
                        right--;
                    }

                    left++;
                    right--;
                }
            }

            return res;
        }
    }
}
