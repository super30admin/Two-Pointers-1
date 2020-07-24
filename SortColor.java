// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// We can keep 2 pointers one for marking the end of red color(0) and one for marking the beginning of blue.
// We can sort by swapping in such a way that any color more than white(1), should be at the end and any color less than
// white, should in the beginning of the array. BY left pointer(here, first) we mean all elements till that point are red(0's)
// and by right pointer(here, last) we mean all elements beyond that point are blue color(2). We traverse the array and swap the element
// based on whether it is greater or lesser than 1.
public class SortColor {
    public void sortColors(int[] nums) {
        int first = 0;
        int last = nums.length - 1;
        int i = 0;
        while (i <= last) {

            if (nums[i] > 1) {
                swap(nums, last, i);
                last--;
            } else if (nums[i] < 1) {
                swap(nums, i, first);
                first++;
                i++;
            } else {
                i++;
            }

        }
    }

    private void swap(int[] nums, int j, int i) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
