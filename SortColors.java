// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        // brute force - nlogn - simply sort the array
        // optimal - count the values of 0,1,2 and add them to array based on count
        int countzero = 0, countone = 0, counttwo = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(0 == nums[i])
            {
                countzero++;
            }
            else if(1 == nums[i])
            {
                countone++;
            }
            else
            {
                counttwo++;
            }
        }
        int j = 0;
        while(j < nums.length)
        {
            while(countzero-- > 0)
            {
                nums[j++] = 0;
            }
            while(countone-- > 0)
            {
                nums[j++] = 1;
            }
            while(counttwo-- > 0)
            {
                nums[j++] = 2;
            }
        }
    }
}
