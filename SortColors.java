// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Notes : Have 3 pointers, low, mid and high, and check if the value at mid equal 1, then increment mid, if value at mid equals 1, swap with value at low and increment the pointers, else swap with value at high and decrement high.

public class SortColors {
    public void sortColors(int[] nums) {
        if(nums.length >= 2){
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;
            
            while( mid <= high && low <= high){
                
                if(nums[high] < nums[low])
                    swap(nums, high, low);
                if(nums[low] > nums[mid])
                    swap(nums, low, mid);
                if(nums[mid] > nums[high])
                    swap(nums, mid, high);
                
                if(nums[mid] == 1)
                    mid++;
                if(nums[low] == 0){
                    low++;
                    if(mid < low)
                        mid = low;
                }
                if(nums[high] == 2)
                    high--;
                
            }
        }
    }
    
    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp; 
    }
}

// Solution from class
// public class SortColors {
//     public void sortColors(int[] nums) {
//         if(nums.length >= 2){
//             int low = 0;
//             int mid = 0;
//             int high = nums.length - 1;
            
//             while( mid <= high){
//                 if(nums[mid] == 1){
//                     mid = mid + 1;
//                 } else if(nums[mid] == 0){
//                     swap(nums, mid, low);
//                     low = low + 1;
//                     mid = mid + 1;
//                 } else {
//                     swap(nums, high, mid);
//                     high = high - 1;
//                 }
//             }
//         }
//     }
    
//     private void swap(int[] nums, int a, int b){
//         int temp = nums[a];
//         nums[a] = nums[b];
//         nums[b] = temp; 
//     }
// }