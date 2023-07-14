class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(mid<=high){
            if(nums[mid]==1) mid++;
            else if(nums[mid]==0){
                int tempmid = nums[mid];
                nums[mid] = nums[low];
                nums[low] = tempmid;
                low++; mid++;
            }else{
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
}