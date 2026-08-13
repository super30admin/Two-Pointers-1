// Approach: Use 3 pointers, mid and left at index 0 and right at the last index.
// Considering that left pointer collects 0, right pointer collects 2 and mid pointer collects 1
// swap the elements accordingly until high crosses mid pointer.

//Time Complexity: O(n)
//Space Complexity: O(1)

class SortColors {
    public void sortColors(int[] nums) {

        // Validate the inputs
        if (nums == null || nums.length == 0) return;

        // Initialize the left, mid and right pointers
        int left = 0, mid = 0, right = nums.length-1;

        while (mid <= right)
        {
            if (nums[mid] == 2) // Swap right pointer element with mid element as right collects 2
            {
                swap(nums, mid, right);
                right--;
            }
            else if (nums[mid] == 0) // Swap left pointer element with mid element as left pointer collects 0
            {
                swap(nums, mid, left);
                mid++;
                left++;
            }
            else{
                mid++;
            }
        }
    }

    // Swap function to sort two elements in the given indices i and j
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}