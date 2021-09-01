// Time Complexity: This is a 1 pass traversal which gives O(n) solution
// Space Complexity: As all manipulations are done inplace. This is an O(1) solution.
// Did you complete it on leetcode: Yes
// Any problems faced: Didn't consider that we need to keep idx on same position when a 2 is encountered.

// Write your approach here
// Idea here is to use 3 pointers. 1 running pointer which encounters 0s and 2s
// and 2 pointers pointing to next pointer of already sorted part.
// when a 0 is encountered index element is assigned left pointer value
// left pointer element is assigned 0 as it is already encounters, now the part till left is already sorted, we increment both left and index
// similarly when 2 is encountered right pointer value assigned to it and right pointer is assigned 2. it is sorted so right decrements
// here we have to keep idx to current position what new value is assigned to do either 0/2 operation on it.
class Solution {
    public void sortColors(int[] nums) {
        int p1=0; int idx = 0; int p2 = nums.length-1;
        while(p2>=idx) {
            if(nums[idx]==0) {
                nums[idx] = nums[p1];
                nums[p1] = 0;
                p1++;
            } else if(nums[idx]==2) {
                nums[idx] = nums[p2];
                nums[p2] = 2;
                p2--;
                idx--;
            }
            idx++;
        }
    }
}