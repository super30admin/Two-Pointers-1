//Sapce complexity: o(1)
//Time complexity: o(n)
class Problem1 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int m = 0;
        int h = n-1;
        while(m<=h){
            if(nums[m] == 0){
                swap(nums, m, l);
                l++;
                m++;
            } else if (nums[m] == 1) {
                m++;
            } else {
                swap(nums, m, h);
                h--;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
