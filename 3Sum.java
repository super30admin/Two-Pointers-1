import java.util.*;

//Time Complexity : O(n logn)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums == null || nums.length == 0)    return new ArrayList();

        Set<List<Integer>> set = new HashSet();
        Arrays.sort(nums);

        for(int i=0;i < nums.length-2; i++){
            int j = i+1;
            int k = nums.length - 1;

            while( j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                }else if(sum > 0){
                    k--;
                }else if(sum < 0){
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
