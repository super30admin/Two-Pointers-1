class Solution {
    public void sortColors(int[] nums) {
        int p1=0;
        int i=0;
        int p2=nums.length-1;
        
        while(i<=p2){
            if(nums[i]==0){
                swap(nums,i,p1);
                i++;
                p1++;
            }
            else if(nums[i]==2){
                swap(nums,i,p2);
                    p2--;
                
            }
            else{
                i++;
            }
        }
    }
    
    private void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j] = temp;
    }
}