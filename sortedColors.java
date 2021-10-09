// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

public class sortedColors{
	public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while(mid <= high) {
            switch (nums[mid]) {
                case 0:
                    int temp = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    int temp1 = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = temp1;
                    high--;
                    break;
            }
        }
    }

}