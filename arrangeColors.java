//Time complexity: O(n)
//Space Complexity: O(1)
class Solution {

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {2, 0, 2, 1, 1, 0};
        sol.sortColors(nums);
        System.out.println(nums);
    }


    public void sortColors(int... nums) {
        int low = 0;
        int high = nums.length - 1;
        int med = 0;

        while (med <= high) {
            if(nums[med] == 1) {
                med++;
            }
            else if(nums[med] == 2) {
                swap(nums, low++, med++);
            }
            else {
                swap(nums, med, high - 1);
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
