1-pass Solution------------------------------------
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
Taking 2 pointers starting and ending index and checking if 0 then swap its elemnet with first pointer P1 and increment P1
if element =2 swap it with p2's value and decrement P2 and index
keep repeating by increasing the index and until its equal to P2
 */

class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        // 1-pass
        int p1 = 0, p2 = nums.length - 1, index = 0;
        while (index <= p2) {
            if (nums[index] == 0) {
                //if current is 0, swap with p1 pointer, increment p1
                nums[index] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            if (nums[index] == 2) {
                //if current is 2, swap with p2 pointer, decrement p2
                nums[index] = nums[p2];
                nums[p2] = 2;
                p2--;
                //may have swapped an extra 0 from the end of array that requires extra processing, so decrement index to account for it
                index--;
            }
            index++;
        }

    }
}





2pass Solution--------------------------------------------------------
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
I am counting number of 0's and 1's and 2's and storing in 3 counters and then iterating the counters
and filling in that many places with corresponding number in the given array
 */

class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int count0 = 0, count1 = 0, count2 = 0;
        for (int num : nums) {
            if (num == 0)
                count0++;
            else if (num == 1)
                count1++;
            else
                count2++;
        }

        int i = 0;

        while (count0 > 0 && i < nums.length) {
            nums[i++] = 0;
            count0--;
        }
        while (count1 > 0 && i < nums.length) {
            nums[i++] = 1;
            count1--;
        }
        while (count2 > 0 && i < nums.length) {
            nums[i++] = 2;
            count2--;
        }

    }
}