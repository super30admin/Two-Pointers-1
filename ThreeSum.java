// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i =0; i< nums.length -2; i++){
            if(nums[i] > 0)
                break;
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int start = i+1;
            int end = nums.length -1;
            int target = 0 - (nums[i]);
            while(start < end){
                if(target < nums[start])
                    break;
                int sum = nums[start] + nums[end];
                if(sum > target)
                    end--;
                else if( sum < target)
                    start++;
                else{
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[start]);
                    list.add(nums[end]);
                    set.add(list);
                    while(start < end && nums[start] == nums[start+1])
                        start++;
                    while(start < end && nums[end] == nums[end-1])
                        end--;
                    start++;
                    end--;
                }
            }
        }
        return new ArrayList<>(set);
    }
}
