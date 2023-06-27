package prog_75_sortColorsArrangeColors;

public class Solution {
    /**
     We have given an array of number 0,1,2 and we have to sort the numbers in place.

     Dutch Flag Solution:
     In this solution we will be maintaining 3 pointers
     left for 0, mid for 1 and right for 2
     We will be starting with left=0, right=n and mid = 0
     if mid == 2 then swap with R and move R -- coz right will be sorted
     if mid == 0 that means swap left with mid and move both the pointers
     if mid == 1 that means mid is at right postion then jst move the mid to next
     once mid and right are crossing each other, then we will break the while loop

     Time Complexity : O(N)
     Note : we can not use this solution for 4 or more numbers
     */
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1 ;
        while(mid<=right){
            if(nums[mid] == 2){
                swap (nums, mid, right);
                right -- ;
            }
            else if(nums[mid] == 0){
                swap(nums, left, mid);
                left ++ ;
                mid ++ ;
            }
            else{
                mid ++ ;
            }
        }

    }
    public void swap(int[] nums, int i, int j){
        int a = nums[i];
        nums[i] = nums[j];
        nums[j]= a ;

    }

}
