// TC - O(n), n --> length of nums, SC - O(1)

class Solution {
    public void sortColors(int[] nums) {
        // Sanity check, if nums is null or length is 0, just return
        if(nums == null || nums.length == 0){
            return;
        }
        // Initializing 3 pointers, l, m to 0 and h to nums.length - 1
        // l --> 0's, m --> 1's and h --> 2's
        // Iterate till m <= h
        // If nums value at mth index is 2, swap values of m and h, decrement h by 1, we are sure at end of array we are only having 2's
        // If nums value at mth index is 0, swap values of m and l, increment l and m by 1 and if nums value at mth index is 1, just m++
        int l=0, m = 0, h = nums.length-1;
        while(m <= h){
            if(nums[m] == 2){
                swap(nums, m, h);
                h--;
            }else if(nums[m] == 0){
                swap(nums, l, m);
                l++;
                m++;
            }else if(nums[m] == 1){
                m++;
            }
        }
    }
    
    // Basic swap function using a temp variable
    private static void swap(int[] nums, int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}