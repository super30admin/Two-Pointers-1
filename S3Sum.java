
// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;

public class S3Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        if(nums == null || n < 2)
            return result;

        Arrays.sort(nums);  // T.C - N. Log N

        for(int i=0; i<n-2; i++){  // T.C - O(N^2)
            // To avoid outside duplicacy
            if(i!=0 && nums[i] == nums[i-1])
                continue;

            // two pointers
            int left = i+1;
            int right = n-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(li);
                    left++;
                    right--;
                    // Left duplicacy
                    while(left< right && nums[left] == nums[left-1])
                        left++;
                    // Right duplicacy
                    while(left < right && nums[right] == nums[right+1])
                        right--;
                } else if(sum < 0)
                    left++;
                else
                    right--;
            }
        }
        return result;
    }
}
