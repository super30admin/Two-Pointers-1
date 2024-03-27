class Solution {
    // TC -> O(N), to loop through the array once,
    // SC -> O(1), no extra space required
    /** 
        Approach : 3 Pointers
        1. Initialize l, m to start and h at end
        2. Move m, when nums[m] value is one
        3. Swap l & m, and move them both, when nums[m] is zero, so that 0 comes at l position
        4. Swap h & m, and move them both, when nums[m] is two, so that 2 comes at h position
    */ 
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1) return;
        int l = 0, m = 0, h=nums.length -1;

        while(l < h && m <= h){
            if(nums[m] == 0){
                swap(nums, l, m);
                l++;
                m++;
            }
            else if(nums[m] == 1)
                m++;
            else{
                swap(nums, h, m);
                h--;
            }
        }
    }

    private void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
