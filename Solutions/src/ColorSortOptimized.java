// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach


class ColorSortOptimized {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid =0;
        int high =nums.length-1;
        while(mid<=high){
            if (nums[mid]==0){
                swap(nums, mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                swap(nums,mid,high);
                high--;
            }
        }


    }
    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j] = temp;
    }
}
