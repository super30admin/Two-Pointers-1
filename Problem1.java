class Solution {
    public void sortColors(int[] nums) {
      if(nums == null || nums.length == 0){
        return;
      }
      int l = 0;
      int r = nums.length-1;
      int curr = 0;
     
      while( curr <= r){
       
        if(nums[curr] == 1){
          curr += 1;
        }
        else if(nums[curr] == 2){
          swap(nums,curr,r);
          r -= 1;
        }
        else if(nums[curr] == 0){
          swap(nums,curr,l);
          l += 1;
          curr += 1;
        }
        // if(nums[l] < nums[r]){
        //   swap(nums[l],nums[r]);
        // }
        // l++;
        // r--;
        
      }
      
    }
  public void swap(int[] nums, int i,int j){
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}
