//TIme Complexity: O(N)
//Space Complexity:O(1)
class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int min=nums[i];
            int idx=i;
            for(int j=i+1;j<nums.length;j++){
                if(min>nums[j]){
                    min=Math.min(min,nums[j]);
                    idx=j;
                }
                
            }
            swap(nums,i,idx);
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}