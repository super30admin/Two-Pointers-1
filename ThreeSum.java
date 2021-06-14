package TwoPointers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Source Link: https://leetcode.com/problems/3sum/
        -------------------------------------------------------------------------------------------------------
        Time complexity : o(n) 
        space complexity: o(1) 
        Did this code run successfully in leetcode : yes
        problems faces : no
        */


public class ThreeSum {

 public List<List<Integer>> threeSum(int[] nums) {

     if(nums == null || nums.length == 0) return new ArrayList<>();
     Arrays.sort(nums);
     List<List<Integer>> result = new ArrayList<>();

     int pivot = 0;
     int low =0;
     int high = nums.length-1;

     while(pivot < nums.length-2 && low<=high)
     {
         int sum = nums[pivot]+nums[low]+nums[high] ;
         if(sum == 0)
         {
             List<Integer> a = Arrays.asList(nums[pivot],nums[low],nums[high]);
             result.add(a);
         }
         else if(sum > 0 )
         {
            int prevHigh = high;
             high --;
             while(nums[high] == nums[prevHigh] )
             {
                 high--;
             }

         }
         else
         {
             int prevLow = low;
             low++;
             while(low<high && nums[low] == nums[prevLow])
             {
                 low++;
             }
         }

         if(low>high)
         {
             int prevPivot = pivot;
             pivot++;
             while(nums[pivot] == nums[prevPivot] && pivot < nums.length-2)
             {
                 pivot++;
             }
             low = pivot+1;
             high=nums.length-1;
         }
     }

     return result;   
    }

}