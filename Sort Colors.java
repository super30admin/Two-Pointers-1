//Time Complexity:O(n)
//Space Complexity:O(1)
/*
Swapping low and highs, so that middle remains in center and all highs are pushed to right and lows to left
*/
class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0;
        int high = nums.length -1;
        int i =0;
        
        while(i<=high) //i will be faster or equal to low
        {
            if(nums[i]==0) swap(nums,low++,i++); //
            else if(nums[i]==2) swap(nums,i,high--);
            else  i++; //(nums[i]==1)
        }
    }
    
    private void swap(int[] nums, int i, int j) {
    int t = nums[i];
    nums[i] = nums[j];
    nums[j] = t;
}
}
