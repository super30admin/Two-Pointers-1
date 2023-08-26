// Time Complexity : O (n^2) 
// Space Complexity : O (1) no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Minor issues, sorting the array, checking base condition inside while loop

import java.util.*;
public class prob2 {

    private static List<List<Integer>> threeSum(int[] nums){
        if(nums == null || nums.length == 0) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // can apply 2 ptr technique only on sorted array O(nlogn)

        // O(n^2)
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicate elements in outer loop
            int lo = i+1; int hi = nums.length - 1;
            while(lo < hi){
                int sum = nums[i] + nums[lo] + nums[hi];
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[lo], nums[hi]);
                    result.add(li);
                    lo++; hi--;
                    while(lo < hi && nums[lo] == nums[lo-1])lo++; // check base condition here also and skip dupes
                    while(lo < hi && nums[hi] == nums[hi+1])hi--;

                }else if(sum < 0) lo++;
                else hi--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    
}
