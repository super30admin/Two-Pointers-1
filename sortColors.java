// Time Complexity = O(n)
// Space complexity = O(1)
/* Approach : Take three pointers , low, mid and high. low and mid are at the starting of array,
high is at the end of the array, if mid in array is 0 then it will swap with low in array and increment
both low and mid. if mid of array is 2 it will swap with high of array and decrement high only.
if mid of array is 1 then it will incrment mid. As we traverse through the array, at a point
we encounter that mid is greater than high, in that case we simply stop traversing as the array
would be sorted.
 */

class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0) return;            // validate if array is empty
        int l = 0;                              // low is initialized and pointed at first element or array
        int m = 0;                              // mid is initialized and pointed at first element or array
        int h = nums.length-1;                  // high is initialized and pointed at last element or array

        while(m <= h){                          // traverse until mid is less or equal to high
            int temp = 0;                       // initialize temp variable to store value while swapping
            if(nums[m] == 0){                   // validate if mid of array is 0
                temp = nums[l];                 // store low of array in temp
                nums[l] = nums[m];              // update low of array with mid of array
                nums[m] = temp;                 // update mid of array with temp
                l++;                            // increment low
                m++;                            // increment mid
            }
            else if(nums[m] == 1){              // validate if mid of array is 1
                m++;                            // increment mid
            }
            else if(nums[m] == 2){              // validate if mid of array is 2
                temp = nums[h];                 // store high of array in temp
                nums[h] = nums[m];              // update high of array with mid of array
                nums[m] = temp;                 // update mid of array with temp
                h--;                            // decrement high
            }
        }        
    }
}