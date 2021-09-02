// TIME: O(n)
// SPACE: O(1)
// SUCCESS on LeetCode

public class SortColors {
    public void sortColors(int[] nums) {
        int p0 = -1;
        int p1 = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                p0++;
                p1++;
                if (nums[p1] == 2) {
                    swap(nums, p0, p1);
                }
                swap(nums, p0, i);
            } else if (nums[i] == 1) {
                p1++;
                swap(nums, p1, i);
            } 
        }
    }
    
    private void swap(int[] nums, int index1, int index2) {
        int x = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = x;
    }
}
