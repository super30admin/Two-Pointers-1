/***
 1. Take 3 pointers- left, right and mid. left points to start element, mid starts with index 0, right points to end element
 2. If mid points to 1 then increment mid
 3. If mid points to 0, then swap mid with left, else if mid points to 2, then swap mid with right
 * TC - O(n), SC - O(1)
 */
class SortColors {
    public void sortColors(int[] nums) {

        int n = nums.length;
        int left =0, mid =0, right = n-1;

        while(mid <= right) {
            if(nums[mid] == 0) {
                //swap element at mid with left
                swap(nums, left, mid);
                //increment left pointer
                left++;
                mid++;
            }

            else if(nums[mid] == 2) {
                //swap element at mid with right
                swap(nums, right, mid);
                //decrement right pointer
                right--;
            }

            else {
                //increment mid pointer
                mid++;
            }

        }
    }

    private void swap(int[] nums, int pos1, int pos2) {
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }
}