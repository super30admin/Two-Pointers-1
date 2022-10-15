//Time Complexity :   O (N) 
//Space Complexity :  O (1) 
//Did this code successfully run on Leetcode :    Yes
class SortColors {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
             
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
                }
            else{
                mid++;
            }
        }
        
    }
}