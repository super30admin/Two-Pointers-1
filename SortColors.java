// The low will take care of all 0. low will be last index of all 0's.
// The mid will take care of all 1. mid will be last index for 1's.
// The high will take care of all 2. high will be the first index of all 2's.
// Space complexity = O(1)
// Time complexity = O(n)// the iteration.

class SortColors {
    public void sortColors(int[] nums) {
        int low =0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<= high) {
            // since we have already taken care of the 2's here.
            // there is a possibility that the swap of high to mid  can have 2 as well.
            // hence we do not increment mid.
            if(nums[mid] == 2 ) {
                swap(nums,mid, high );
                high--;
            } else if(nums[mid] == 0 ) {// the only thing that will be swapped between this is 0 and 1.
                // mid will get 1. and low will get 0.
                // hence we increment low and mid.
                swap(nums, low, mid);
                low++;
                mid++;
            } else {
                // we got 1 .
                // increment mid.
                mid++;
            }
        }
        
    }
    
    // swap function.
    private void swap(int[] nums ,int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}