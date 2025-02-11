class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,high,mid);
                high--;
            }
            else if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else{
                mid++;
            }


        }
    }
    private void swap(int[] nums,int mid, int lorh ){
        int temp=nums[lorh];
        nums[lorh]=nums[mid];
        nums[mid]=temp;


    }
}