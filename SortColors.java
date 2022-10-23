package S30_Codes.Two_Pointers_1;

// Time Complexity : O(n) // n = nums.length
// Space Complexity : O(1)
// Two-Pointers-1

class SortColors {
    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int i = 0;

        while(i <= r){
            if(nums[i] == 0){
                swap(nums, i, l);
                l++;
                i++;
            }
            else if(nums[i] == 2){
                swap(nums, i, r);
                r--;
            }
            else
                i++;
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}