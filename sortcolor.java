class Solution {
    public void sortColors(int[] nums) {
        int l=0,h=nums.length-1;
        for(int i=0;i<=h;i++){
            if(nums[i]==1) continue;
            if(nums[i]==0) {
                swap(i,l,nums);l++;
            }
            if(nums[i]==2) {
                swap(i,h,nums);h--;i--;
            }            
        }
    }
    private void swap(int i, int j, int [] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
