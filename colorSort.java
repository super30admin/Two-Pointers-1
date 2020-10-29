//Time Complexity: O(n) 
//Space Compexity: O(1)
//Program ran successfully
/*
    Algorithm: 1. Initialize 3 pointers => low, mid and high
               2. The idea is to push all the zeros at the beginning and all the 2s to the end, the 1s would automatically sort itself in middle
               3. We start traversing the array, if nums[mid] is 0, we swap it with the element at the low pointer and increment low pointer and mid pointer.
               4.  If nums[mid] = 2, we swap it with the element at the high pointer and decrement the high pointer. We do not increment the mid pointer over here because we need to check the element that we swapped from the right.
               5. When the mid pointer crosses high, the array is in the desired state.
*/
class colorSort {
    public void sortColors(int[] nums) {
        //edge cases
        if(nums.length == 0 || nums == null) return;
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
                continue;
            }else if(nums[mid] == 2){
                swap(nums, high, mid);
                high--;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
