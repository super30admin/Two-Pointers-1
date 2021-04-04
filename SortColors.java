//Also called Dutch National Flag Problem
//Approach - Two pointers
//Time Complexity - O(N) - where N is the length of nums
//SPace Complexity - O(1)

class Solution {
  public void sortColors(int[] nums) {

    if(nums == null || nums.length == 0){
      return;
    }

    int low = 0, mid = 0, high = nums.length-1;

    while(mid <= high){

      if(nums[mid] == 1){
        mid++;
      }
      else if(nums[mid] == 0){
        nums[mid] = nums[low];
        nums[low] = 0;

        low++;
        mid++;

      }else{

        nums[mid] = nums[high];
        nums[high] = 2;

        high--;
      }
      //    print(nums);
    }
  }

  private void print(int[] arr){
    for(int i: arr){
      System.out.print(i+" ");
    }
    System.out.println("");
  }
}