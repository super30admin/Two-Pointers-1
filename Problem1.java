class Problem1 {
    public static void main(String[] args) {
        int[] nums = new int[] { 2, 0, 1, 1 };
        sortColors(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void sortColors(int[] nums) {
        int lo = 0;
        int hi = nums.length - 1;
        int idx = 0;
        int temp;
        while (idx <= hi) {
            if (nums[idx] == 0) {
                temp = nums[idx];
                nums[idx] = nums[lo];
                nums[lo] = temp;
                idx++;
                lo++;
            } else if (nums[idx] == 2) {
                temp = nums[idx];
                nums[idx] = nums[hi];
                nums[hi] = temp;
                hi--;
            } else {
                idx++;
            }
        }
    }
}