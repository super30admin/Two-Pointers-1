class Solution {
    public void sortColors(int[] nums) {
        
        int left = 0,right = nums.length -1,curr = 0;
        while(curr <= right){
            if(nums[curr] == 0){
                swap(nums,left,curr);
                left++;
                curr++;
            }
            else if(nums[curr] == 1){
                curr++;
            }
            else{
                swap(nums,curr,right);
                right--;
            }
        }
    }
    
    private void swap(int[] nums,int l,int r){
        int temp = nums[l];
        nums[l]= nums[r];
       nums[r] = temp;
    }
    
}
//Time Complexity: O(n)
