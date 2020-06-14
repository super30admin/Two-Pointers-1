// Time Complexity : O(N)
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

import java.util.*;
class Main{
  public static void main(String []args){
    int []nums={0,1,2,0,1,2,0,2,0,1,2,0,1,2,0,1,2,0,};
    Main m = new Main();
    m.sortColors(nums);
    for(int i=0;i<nums.length;i++){
      System.out.print(nums[i]+", ");
    }
  }
  private static int[] sortColors(int []nums){
    int low=0; int high=nums.length-1; int mid=0;
    for(int i=0;i<nums.length;i++){
      if(nums[mid]==1){
        mid++;
      } else if(nums[mid]==2){
        int temp=nums[mid];
        nums[mid]=nums[high];
        nums[high]=temp;
        high--;
      }else if(nums[mid]==0){
        int temp=nums[mid];
        nums[mid]=nums[low];
        nums[low]=temp;
        low++; mid++;
      }
    }
    return nums;
  }
}