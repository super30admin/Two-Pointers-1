// Time Complexity :O(n)
// Space Complexity :O(1)
class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int k=nums.length-1;
        int j=0;
        while(j<=k){
            if(nums[j]==2){
                swap(j,k,nums);
                k--;
            }
            else if(nums[j]==1){
                j++;
            }
            else if(nums[j]==0){
                swap(i,j,nums);
                i++;
                j++;
            }
        }
    }
    
    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
