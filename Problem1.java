class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int left=0;
        int mid=0;
        int right=n-1;
        while(mid<=right){
            //move 2 towards right side using mid pointer
            if(nums[mid]==2){
                swapColors(nums, mid, right);
                right--;
            }
            //move 0 towards left side using mid pointer
            else if(nums[mid]==0){
                swapColors(nums, mid, left);
                mid++; left++;
            }
            else{ // for nums[mid]==1, contains 1's in middle
                mid++;
            }

        }        
        
    }

    private void swapColors(int[] nums, int mid, int idx){
        int temp=nums[idx];
        nums[idx]=nums[mid];
        nums[mid]=temp;

    }
}