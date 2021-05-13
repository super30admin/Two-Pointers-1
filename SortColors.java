package TwoPointers1;

/*S30 Big N Problem #34 {Medium} - https://www.youtube.com/watch?v=BBvzdJastJQ
    An array of n objects of colurs red white or blue you need to sort them in place and make sure that objects of the same colour are adjacent with the colours in the order red then white and 
    at last blue. here we wil use integer values 0,1 and 2 to represent the color red , white and blue respectively. and you cannot use the library's sort function for this problem. 

    Example:
    Input: [2,0,2,1,1,0]
    Output: [0,0,1,1,2,2]
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
