import java.util.*;

// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

class SortColoursSolution
{
    public static void main(String[] args){
      int[] nums = {2,0,2,1,1,0};
      sortColors(nums);
      System.out.printf("[ ");
      for(int i : nums){
         System.out.printf("%d, ",i);
      }
      System.out.printf(" ]\n");

    }
    // 1. count 0, 1 and 2 in first pass
    // place them in output in second pass
    public static void sortColors(int[] nums) {
      if(nums == null || nums.length == 0) return;

      int zeroCount = 0;
      int oneCount = 0;
      int twoCount = 0;

      for(int i = 0; i < nums.length; i++){
          if(nums[i] == 0){
            zeroCount++;
          }else if(nums[i] == 1){
            oneCount++;
          }else{
            twoCount++;
          }
      }

      for(int i = 0; i < nums.length; i++){
        if(zeroCount > 0){
            nums[i] = 0;
            zeroCount--;
        }else if(oneCount > 0){
            nums[i] = 1;
            oneCount--;
        }else{
            nums[i] = 2;
            twoCount--;
        }
      }
    }

}
