/**LC-75   With Two Pointer method
 * Time Complexity : worst case: O(N)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
 *
 Algorithm:
 1. Use three pointers:
    low to contain 0s
    mid to contain 1s
    high to contain 2s
 2. Repeat the algo till mid and high don't cross each other

 */
package TwoPointers;

public class sortColorsWithPointerMethod {

    //A very good example: [1,2,2,0,0,1,1]

        public void sortColors(int[] nums) {

            if(nums == null || nums.length == 0) return;

            int low = 0;
            int mid = 0;
            int high = nums.length - 1;

            while(mid <= high){
                if(nums[mid] == 0){
                    nums = swap(nums, mid, low);
                    mid++;
                    low++;
                }
                else if(nums[mid] == 1){
                    mid++;
                }
                else{
                    nums = swap(nums, mid, high);
                    high--;
                }
            }

        }

        public int[] swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            return nums;
        }

}
