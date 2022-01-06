Time: O(n);
space: O(1);//inplace

class Solution1 {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                nums[mid]=nums[low];
                nums[low]=0;
                if(low==mid){
                    mid++;
                }
                low=low+1;


            }else if(nums[mid]==1){
                mid=mid+1;
            }else{
                nums[mid]=nums[high];
                nums[high]=2;
                high=high-1;
            }
        }




    }
}