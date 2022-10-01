class Solution {
    public void sortColors(int[] nums) {
        boolean done = false;
        while(!done){
          done = true;
    for (int i = 1; i < nums.length; i += 1) {
      if (nums[i - 1] > nums[i]) {
        done = false;
        int tmp = nums[i - 1];
        nums[i - 1] = nums[i];
        nums[i] = tmp;
      }
    }
  }
    return;
}
    
}