//Approach - Two Pointer
// keep 2 pointers at both end and caluclate the water container volumne with the lowest among the low and high heights multiplied by their distance
//Time Complexity - O(N)
//Space Complexity - O(1)

class Solution {
  public int maxArea(int[] height) {

    int max = 0;
    int low = 0, high = height.length -1;

    while(low<high){

      max = Math.max(max, Math.min(height[low], height[high])*(high-low));

      if(height[low] <= height[high]){
        low++;
      }else{
        high--;
      }
    }
    return max;
  }
}