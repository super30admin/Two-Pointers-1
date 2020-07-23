/*
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes


// Your code here along with comments explaining your approach

    everything left of i is less than 1,
    use i and j to keep track of next location of 0 and 2 respectively.
    everything right of j is greater than 1.
*/
class Solution {
    public void sortColors(int[] nums) {
        int stpt = 0;
        int enpt = nums.length -1;
        int cur = 0;

        while(cur <= enpt ){
            if(nums[cur] == 0){
                int tmp = nums[stpt];
                nums[stpt] = nums[cur];
                nums[cur] = tmp;
                stpt++;cur++;
            }
            else if(nums[cur] == 1){
                cur++;
            }
            else{
                int tmp = nums[enpt];
                nums[enpt] = nums[cur];
                nums[cur] = tmp;
                enpt--;
            }
        }
    }
}
