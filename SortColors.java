package TwoPointers1;

/*
    Source Link: https://leetcode.com/problems/sort-colors/
        -------------------------------------------------------------------------------------------------------
        Time complexity : o(n) 
        space complexity: o(1) 
        Did this code run successfully in leetcode : yes
        problems faces : no*/


public class SortColors {

 public void sortColors(int[] nums) {

     if(nums == null || nums.length == 0) return ;

     int low = 0;
     int mid=0;
     int high=nums.length-1;

     while(mid<=high) {

         if( nums[mid] == 0)
         {
             swap(nums,mid,low);
             low++;
             mid++;
         }
         else if( nums[mid] == 1)
         {
             mid++;
         }
         else {
             swap(nums,mid,high);
             high --;
         }

     }

    }

   private int[] swap(int[] nums, int index1,int index2)
   {
       int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
       return nums;
   }

}