class SortColors {
  /**
   * Leetcode: https://leetcode.com/problems/sort-colors/
   * 
   * Time Complexity: O(n)
   * Space Complexity: O(1)
   * Any issue solving this on leetcode? No
   * 
   */
  public void sortColors(int[] nums) {
    int start = 0, index = 0;
    int end = nums.length - 1;
    
    while(start < end && index <= end){
        if(nums[index] == 0){ // swap with start
            nums[index] = nums[start];
            nums[start] = 0;
            start++;
            index++;
        } else if (nums[index] == 2){ // swap with end
            nums[index] = nums[end];
            nums[end] = 2;
            end--;
        } else {
            index++;
        }
    }
  }
}
