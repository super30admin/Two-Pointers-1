// TC: O(n)
//SC: O(1)
// Approach:
/*
    // 1) All the numbers from 0 to low-1 will be zero's.
    // 2) All the numbers from low to mid -1 will be all 1's.
    // 3) All the numbers towards the right side of high will be 2's.
* */


class Solution {

  public void sortColors(int[] nums) {
    int low = 0;
    int mid = 0;
    int high = nums.length - 1;
    // 1) All the numbers from 0 to low-1 will be zero's.
    // 2) All the numbers from low to mid -1 will be all 1's.
    // 3) All the numbers towards the right side of high will be 2's.

    while(mid <= high) {
      if(nums[mid] == 0) {
        swap(nums, low, mid);
        low++;
        mid++;
      }
      else if(nums[mid] == 1) {
        mid++;
      }
      else if(nums[mid] == 2) {
        swap(nums, mid, high);
        high--;
      }
    }
  }
  void swap(int[] nums, int a, int b) {
    int temp = nums[a];
    nums[a] = nums[b];
    nums[b] = temp;
  }
}