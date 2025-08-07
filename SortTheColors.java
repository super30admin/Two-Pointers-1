// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. Initialize three pointers: start, mid, and end, where start is at the beginning, mid traverses, and end is at the end.
// 2. Process the array based on nums[mid]:
//    - If nums[mid] == 0, swap with start and move both start and mid forward.
//    - If nums[mid] == 2, swap with end and move end backward.
//    - If nums[mid] == 1, move mid forward.
// 3. The array is sorted in-place as the algorithm moves elements to their correct positions.


public class SortTheColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int start = 0, mid = 0, end = n - 1;

        while(mid <= end){
            if(nums[mid] == 2){
                swap(nums, mid, end);
                end--;
            }else if(nums[mid] == 0){
                swap(nums, start, mid);
                start++;
                mid++;
            }else{
                mid++;
            }
        }
    }

    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
