// TC: O(n)
// SC: O(1)
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int h = n-1;
        int l = 0;
        int m = 0;

        while(m <= h){
            if(nums[m] == 2){
                swap(nums, m, h);
                h--;
            }
            else if(nums[m] == 0){
                swap(nums, m,l);
                l++; m++;
            }
            else{
                m++;
            }
        }
    }
    private void swap(int[] nums, int a, int b){
        if( a!= b){
            nums[a] = nums[a] + nums[b];
            nums[b] = nums[a] - nums[b];
            nums[a] = nums[a] - nums[b];
        }
    }
}