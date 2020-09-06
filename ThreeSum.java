import java.util.*;
// Time Complexity : O(NlogN + N^2) NlogN - sorting, N^2 - while inside for loop.
// Space Complexity : O(1) - same array is manipulated.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//We use two pointer approach to solve it in one pass. The pointers used are: cur, left and right.
//Sum of numbers at three indices are calculated and pointers are manipulated accordingly. If sum > 0, R is decremented.
//If sum < 0, left incremented. if sum == 0, add it to result list. 
//To avoid duplicates, always check if nums[i] == nums[i-1] and nums[L] == nums[L-1] and nums[R] == nums[R+1].

public class ThreeSum {
    
    public static List<List<Integer>> threeSum(int[] nums){
        if(nums == null || nums.length == 0) return new ArrayList<>(); 

        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < nums.length-2; i++){

            if(i > 0 && nums[i] == nums[i-1]) continue;
            int L = i+1, R = nums.length-1;

            while(L<R){
                int sum = nums[i]+nums[L]+nums[R];
                if(sum < 0) L++;
                else if(sum > 0) R--;
                else if(sum == 0){
                    list.add(Arrays.asList(nums[i],nums[L],nums[R]));
                    L++;
                    R--;
                    while( L < R && nums[L] == nums[L+1] ) L++;
                    while( L < R && nums[R] == nums[R-1] ) R--;
                }
            }
        }
        return list;
    }
}
