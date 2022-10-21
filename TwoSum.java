// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TwoSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int x = 0 ;
        int n = nums.length;
        Arrays.sort(nums);


        List<List<Integer>> result = new ArrayList<>();


        while (x < n ){
            int left = x + 1;
            int right = n-1;

            while(left < right){

                int sum = nums[x] + nums[left] + nums[right];

                if (sum == 0){
                    result.add(Arrays.asList(nums[x], nums[left], nums[right]));
                }

                if (sum > 0){
                    right--;
                    while (left < right && nums[right] == nums[right+1]) right--;
                }
                else if (sum <= 0){
                    left++;
                    while(left < right && nums[left] == nums[left-1]) left++;
                }
            }
            ++x;
            while (x<n && nums[x] == nums[x-1]) ++x;
        }
        return result;
    }

    public static void main(String[] args){
        int []nums = {-1,0,1,2,-1,-4};
        TwoSum obj = new TwoSum();
        System.out.println(obj.threeSum(nums));
    }
}

