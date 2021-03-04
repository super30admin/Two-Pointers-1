class SortColors {
    
    // Time Complexity: O(n)
    // Space Complexuty: O(1)
    
    public void sortColors(int[] nums) {
        int small = -1;
        int large = nums.length;
        for(int i = 0; i < large; i++){
            if(nums[i] == 0){
                swap(nums,++small,i);
            }else if(nums[i] == 2){
                swap(nums,--large,i--);
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}