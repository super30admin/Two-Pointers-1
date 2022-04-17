//TC : O(N) SC:O(1)
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        int r =0;
        int w =0;
        int b = nums.length-1;

        while(b >= w)
        {
            if(nums[w] == 0)
            {
                swap(nums,r,w);
                r++;
                w++;
            }
            else if(nums[w] == 2)
            {
                swap(nums,w,b);
                b--;
            }
            else
                w++;
        }
    }

    private void swap(int[] nums, int p1,int p2){
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}