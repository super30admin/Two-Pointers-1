// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* APPROACH:
Using the 3 pointers approach :
0pointer, 1pointer, 2pointer respectively to maintain the position for all the three colours.
0pointer and 1 pointer start from the 0th index, whereas the 2pointer starts from the end of the array.
The swapping is taken care by the 1pointer.
1. if(1pointer encounters a 0) swap the elements at 0pointer with 1pointer. 0pointer++, 1pointer++
here we also do pointer1++ as here we will never encounter in place of 0 as 1pointer is also starting from 0 and will always take care of pointer2
2. else if(1 pointer encounters a 2) swap the elements at 2pointer with 1pointer. 2pointer--
here we don't do pointer1++ as we can also get 0 as no track by pointer1
3. else if(1 pointer encounters 1) 1pointer++

we run the three conditions until pointer1 <= pointer2
*/

import java.util.Arrays;

public class sortColours {
    public static void sortColors(int[] nums) {

        //brute force
        /*
        int count0 = 0, count1 = 1, count2 = 2;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) count0++;
            else if(nums[i] == 1) count1++;
            else count2++;
        }

        for(int i = 0; i< nums.length; i++){
            if(i<count0) nums[i] = 0;
            if(i>=count0 && i<count1) nums[i] = 1;
            if(i>=count1 && i<count2) nums[i] = 2;
        }

        */


        int low = 0, high = nums.length-1, mid=0;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++; mid++;
            }else if(nums[mid] == 2){
                swap(nums, mid, high);
                //here we do not increment mid as we can encounter 0 here while swapping with high as high might contain 1 as value
                high--;
            }else{
                mid++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args){
        int[] nums1 = {2,0,2,1,1,0};
        sortColors(nums1);
        System.out.println(Arrays.toString(nums1)); //[0,0,1,1,2,2]

        int[] nums2 = {2,0,1};
        sortColors(nums2);
        System.out.println(Arrays.toString(nums2)); //[0,1,2]
    }
}
