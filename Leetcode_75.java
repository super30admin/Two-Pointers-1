//Three pointers
//low - to store 0's
//high - to store 2's
//mid travel
//if nums[mid]==2 --> swap with high pointer
//if nums[mid]==0 --> swap with low pointer
//if nums[mid]==1, don't swap. Just increment pointer. If later 0 comes, then swap will happen. 

//tc: o(n), sc: o(1)
class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;

        int low=0,high=n-1,mid=0;

        while(mid<=high){
            if(nums[mid]==2){
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }else if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }


        }
        
    }
}
