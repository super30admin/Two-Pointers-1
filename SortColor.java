public class SortColor {
    public void sortColor(int[] nums) {
        int left = 0;
        int i=0;
        int right = nums.length-1;
        while (i<=right){
            if (nums[i] == 2) {
                swap(nums, i, right);
                right--;
            } else if (nums[i] == 0) {
                swap(nums, i, left);
                left++;
                i++;
            } else {
                i++;
            }
        }
    }
    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
