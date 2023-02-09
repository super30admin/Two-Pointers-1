/*
Sort Colors
approach: two pointers, l tracks 0 position, m 1's, h 2's
time: O(n)
space: O(1)
 */
public class Problem1 {
    public void sortColors(int[] nums) {

        int l = 0, h = nums.length-1, m = 0;

        while(m<=h) {
            if(nums[m]==2) {
                swap(m,h, nums);
                h--;
            }
            else if(nums[m]==0) {
                swap(m,l, nums);
                l++;m++;
            } else {
                m++;
            }
        }

    }

    private void swap(int i, int j, int[] nums) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
