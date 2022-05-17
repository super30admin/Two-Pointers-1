/**
 * Dutch Flag algorithm problem
 * 
 * time: O(n)
 * space: O(1)
 * 
 * Approach:
 * 1. use 3 pointers for keeping each number
 *   L -> 0
 *   M -> 1
 *   R -> 2
 * 
 * Init L,M with 0, R with n-1 
 * 
 * 2. Compare the mid with 0,1,2
 * 3. Swap the mid element with L or R accordingly
 */
class Problem34 {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        int left = 0;
        int right = n-1;
        int m = 0;
        
        while(m <= right){
            if(nums[m] == 0){
                swap(nums, left, m);
                left++;
                m++;
            } else if(nums[m] == 2){
                swap(nums, right, m);
                right--;
                // not incrementing m here as we are not confident
                // that the element from right will be 1 or 0
            } else {
                m++;
            }
        }
    }
    
    public void swap(int[] arr, int i, int j){
        if(arr == null || arr.length == 0) return;
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}