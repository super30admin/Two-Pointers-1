
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on LeetCode : Yes
// Any problem you faced while coding this : No

//Approach:  As there are only 3 numbers representing 3 colours - 0,1,2.  We can imagine all 0's will be first, all 1 will be
// in the middle and all 3 will be at the end. If the element is 1  no need to swap, we only
// increment the mid by 1, in the case of  0 swap  left and mid and then increment left and mid by 1 (if first element
// itself is 0 then swap happens which is ok).  In case of 3
//  swap mid and right and then reduce right by 1.


public class SortColors {

        public static void sortColors(int[] nums) {
            int size = nums.length;
            if(size== 0) return;
            int left=0, mid = 0, right = size-1;
            while ( mid <= right ) {
                if( nums[mid] == 0 ){
                    swap(nums, left, mid );
                    mid++;
                    left++ ;
                }
                else if( nums[mid] == 1 ) {
                    mid++ ;
                }
                else if( nums[mid] == 2 ) {
                    swap(nums, mid,right );
                    right-- ;
                }
            }
        }
        public  static void swap(int[] a, int left, int right){
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
        }

        public static void main (String[] args){
            int[] nums = {0,1,2,1,0,2};
            int[] nums1 = {0,0,0,0,0};
            int[] nums2 = {1,1,1,1,1};
            int[] nums3 = {2,2,2,2,2};
            sortColors(nums);
            sortColors(nums1);
            sortColors(nums2);
            sortColors(nums3);
        }
}
