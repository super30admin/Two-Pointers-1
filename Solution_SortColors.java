//TC: O(n)
//SC: O(1)
//Did it run on leetcode: Yes
public class Solution_SortColors {

    public void swap(int[] nums, int f, int s){
        int temp = nums[f];
        nums[f] = nums[s];
        nums[s] = temp;
    }

    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0;
        int mid = 0;
        int right = n-1;

        while(mid <= right){
            if(nums[mid] == 2){
                swap(nums, mid, right);
                right--;
            } else if(nums[mid] == 0){
                swap(nums, left, mid);
                left++;
                mid++;
            } else {
                mid++;
            }
        }
    }
}
