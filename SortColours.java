// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

public class SortColours {
    public static void sortColors(int[] nums) {

        int low = 0, mid = 0, high = nums.length-1;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                swap(nums, mid, low);
                low++;
                mid++;
            }else if(nums[mid] == 2)
            {
                swap(nums, mid, high);
                high--;

            }else {
                mid++;
            }
        }

        for(int x : nums)
            System.out.print(x+" ");
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }
}
