// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this: No


var sortColors = function(nums) {
    //return nums.sort()

    let low = 0, high = nums.length - 1, mid = 0;
    if(nums == null || nums.length == 0) return
    
    while(mid <= high){
        if(nums[mid] == 1){
            mid++
        }
        else if(nums[mid] == 2){
            swap(nums, mid, high);
            high--;
        }
        else {
            swap(nums, mid, low);
            low++; mid++;
        }
    }


    function swap(nums,i, j){
      let temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp; 
  }
}