// Time Complexity :O(nˆ2) --> beacuse of for loop
// Space Complexity :1
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : Yes
// My code keeps duplicates . Need to work on that

// Your code here along with comments explaining your approach
// 1. Sort the array and sort through first n-2 elements. Initialize left pointer as next element and right pointer as last element
// 2. For each element check if left+right+current element = 0 and add to list . Else update left and right pointers accordingly.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-2;i++){
            int l = i+1;
            int r = nums.length-1;
            int x = -nums[i];
            List<Integer> list = new ArrayList<>();
            while(l<r){
                if(nums[l]+nums[r] == x){
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    result.add(list);
                    l++;r--;
                    while(l<=r && nums[l] == nums[l-1]){ l++;i++;}
                    while(l<=r && nums[r] == nums[r+1]) r--;
                    break;
                }
                else if(nums[l]+nums[r]<x)
                    l++;
                else
                    r--;
            }
            // if(l<r) break;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,0,0};
        System.out.print(threeSum(nums));
    }
}
