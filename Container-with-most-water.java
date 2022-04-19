//time - O(n)
//space - O(1)
class Solution {
    public int maxArea(int[] nums) {
        int max = 0;
        int p1 = 0, p2 = nums.length-1;

        while(p1 < p2){
            max = Math.max(max, (p2-p1)*Math.min(nums[p1], nums[p2]));
            if(nums[p1] <= nums[p2]){
                p1++;
            }
            else{
                p2--;
            }
        }

        return max;
    }
}