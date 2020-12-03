// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : i forgot to increment p1 after swapping with p0 index


// Your code here along with comments explaining your approach
// 1. have 3 pointers p0, p1 and p2
// 2. if nums[p1] == 0 swap it with p0 and increment both p0 and p1. by this we are making sure that
//    elements before p1 are zeroes.
// 3. similarly if(nums[p1] == 2) swap with p2 and decrement p2. by this we are making sure that elements
//    after p2 are 2's.

class Solution {
    public void sortColors(int[] nums) {
        
        int p0 = 0, p1 = 0, p2 = nums.length - 1;
        
        while(p1 <= p2) {
            
            if(nums[p1] == 0) {
                int temp = nums[p0];
                nums[p0] = nums[p1];
                nums[p1] = temp;
                p0++;
                p1++;
            }
            else if(nums[p1] == 2) {
                int temp = nums[p2];
                nums[p2] = nums[p1];
                nums[p1] = temp;
                p2--;
            }
            else
                p1++;            
        }
        
    }
}