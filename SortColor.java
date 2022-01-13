class Solution {
    public void sortColors(int[] nums) {
       int low=0; int high= nums.length-1;int mid=0;
        int temp;
        while(mid<=high){
            if(nums[mid]==0){
                temp=nums[mid];
                nums[mid]= nums[low];
                nums[low]= temp;
                mid++;
                low++;
            }
            else if(nums[mid]==2){
                temp=nums[mid];
                nums[mid]= nums[high];
                nums[high]= temp;
                high--;
            }
            
            else mid++;
        }
       
    }
}