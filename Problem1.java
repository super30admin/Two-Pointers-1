//time O(n
//space O(1)

class Solution {
    public void sortColors(int[] nums) {
        int p0 = 0;
        int curr = 0;
        int p2 = nums.length-1;
        
        while(curr <= p2) {
            if(nums[curr] == 0) {
                int tmp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = tmp;
            } else if (nums[curr] == 2){
                int tmp = nums[p2];
                nums[p2--] = nums[curr];
                nums[curr] = tmp;
            } else {
                curr++;
            }
        }
        
    }
}
