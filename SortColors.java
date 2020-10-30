// Time Complexity : O(n) where  n is size of the input array
// Space Complexity : O(1) not extra auxiliary space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*Approach
 * We used two pointers to solve the problem. Low pointer will be maintaining the position of the right most zero and
 * high pointer will be used to maintain the position of value two. We swap the values if we get 0 or 2 while traversing the array and
 * update the pointers accordingly.
 *  */


public class SortColors {

    public void sortColors(int[] nums) {
        //edge
        if(nums==null || nums.length==0) return;
        int n=nums.length;
        int low=0, high = n-1, curr=0;
        while (curr<high){
            if(nums[curr]==0){
                swap(nums, low, curr);
                low++; curr++;
            }
            else if(nums[curr]==2){
                swap(nums, curr, high);
                high--;
            }
            else {
                curr++;
            }
        }

    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
