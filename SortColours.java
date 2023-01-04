// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

/**
 *  Take three counter index to map the position of 0,1,2 which can be used to track the count and occurence.
 *  Traverse through array and check for 0,1,2 and increment the other two indexes.
 */

public class SortColours {

  public void sortColors(int[] nums) {
    int zeroIndex = 0;
    int firstIndex = 0;
    int secondIndex = 0;

    for (int i=0 ; i < nums.length ; i++) {
      if(nums[i] == 0) {
        nums[secondIndex] = 2;
        nums[firstIndex] = 1;
        nums[zeroIndex] = 0;
        zeroIndex++;
        firstIndex++;
        secondIndex++;
      } else if(nums[i] == 1) {
        nums[secondIndex] = 2;
        nums[firstIndex] = 1;
        firstIndex++;
        secondIndex++;

      } else if(nums[i] == 2) {
        nums[secondIndex] = 2;
        secondIndex++;
      }
    }
  }
}
