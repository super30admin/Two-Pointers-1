// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
//Here I have used two pointer approach low(0), mid(1) and high(2) and swap the values accordingly
public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        int mid = 0;

        while(mid<=high){
            if(nums[mid]==0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
            else {
                mid++;
            }
        }

    }
}
