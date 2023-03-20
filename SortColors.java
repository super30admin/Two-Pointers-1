//Leetcode - 75
//Time Complexity - O(N)
//Space Complexity - O(1)
public class SortColors {

    public void sortColors(int[] nums) {
        //Dutch Algorithm
        int low=0,mid=0,high = nums.length-1;
        while(mid<=high) {
            if(nums[mid] == 2) {
                swap(mid,high, nums);
                high--;
            } else if(nums[mid] == 0) {
                swap(low,mid, nums);
                low++;
                mid++;
            } else {
                mid++;
            }
        }
    }
    private void swap(int i, int j, int nums[]) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
