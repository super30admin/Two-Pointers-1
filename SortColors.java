//Time complexity is O(N)
//Space complexity is O(1)
class Solution {
    public void sortColors(int[] nums) {
        int lo= 0;
        int hi = nums.length-1;
        int i=0;
        while(i<=hi){
            
            if (nums[i] == 0) {
                // swap p0-th and curr-th elements
                // i++ and j++
                int tmp = nums[lo];
                nums[lo] = nums[i];
                nums[i] = tmp;
                i=i+1;
                lo=lo+1;
            }
            else if (nums[i] == 2) {
                int tmp = nums[i];
                nums[i] = nums[hi];
                nums[hi] = tmp;
                hi=hi-1;
            }
            else i++;
        }        
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}