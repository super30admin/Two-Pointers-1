package S30.TwoPointers_1;

/*
Time Complexity : Put: O(n^2)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        if(nums.length == 0) return result;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;i++){
        //do a 2 pointer search for every element in the nums array by fixing it as the first number
            int num = nums[i];
            if(i != 0 && num == nums[i-1]) continue;
            int j = i+1;
            int k = nums.length - 1;

            while(j < k){
                int sum = nums[j] + nums[k] + num;
                if(sum > 0) k--;
                else if (sum < 0) j++;
                else{
                    result.add(Arrays.asList(num,nums[j],nums[k]));
                    while(j < k && nums[j+1] == nums[j]) j++;
                    while(j < k && nums[k] == nums[k-1]) k--;
                    j++;
                    k--;
                }

            }
        }
        return result;
    }
}
