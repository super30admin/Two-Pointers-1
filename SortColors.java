// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/*
Approach:
=========
1. 2 pass solution -> one for counting 0,1,2 and other for filling
*/

class Solution {
    public void sortColors(int[] nums) {

        int zeroes = 0, ones = 0, twos = 0; 
        // keep track of number of 0,1,2's
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
                zeroes++;
            else if(nums[i] == 1)
                ones++;
            else
                twos++;
        }

        // Update array with 0,1,2's consecutively
        for(int i = 0; i < nums.length; i++) {
            if(zeroes != 0) {
                nums[i] = 0;
                zeroes--;
            }
            else if(ones != 0) {
                nums[i] = 1;
                ones--;
            }
            else {
                nums[i] = 2;
                twos--;
            }
        }
    }
}

//================================= Approach-2 ======================================
/*
Approach:
=========
1. Use three pointers here zero -> to point to right most 0, two -> to point to left most 2 and curr to iterate through the array
2. If value at curr is 0, implies swap has to happen between zero and curr
3. If value at curr is 2, swap has to happen between two and curr
4. At the end, we have sorted array

*/
class Solution {
    public void sortColors(int[] nums) {
        int zero = 0, curr = 0;
        int two = nums.length - 1;
        int temp;
        
        while(curr <= two) {
            // if the nums[curr] value equal to 0, swap value pointing at zero and curr, so that 0 is always to the left of all 1's and 2's
            if(nums[curr] == 0) {
                temp = nums[zero];
                nums[zero++] = nums[curr];
                nums[curr++] = temp; 
            }
            
            // if nums[curr] equal to 2, implies push it to end using pointer at index two, so that 2 is always right of 1's and 0's
            else if(nums[curr] == 2) {
                temp = nums[curr];
                nums[curr] = nums[two];
                nums[two--] = temp;
            }
            else
                curr++;
        }
    }
}