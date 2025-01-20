// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// we kept i fixed and moved left and right to make a sum. if it reached 0 we retuned
//if sum less we inc left
//if sum>0 we dec right
//when sum==0 we looped until no duoes in left/right pointer
//we stopped at left<right
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            int left=i+1, right = n-1;
            if(i>0 && nums[i-1]==nums[i]) continue;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum<0){
                    left++;
                } else if(sum>0){
                    right--;
                } else{
                    Integer [] triplets= {nums[i], nums[left], nums[right]};
                    result.add(Arrays.asList(triplets));
                    left++;
                    right--;
                    while(left<right && nums[left-1]==nums[left]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
            }
        }
        return result;
    }
}