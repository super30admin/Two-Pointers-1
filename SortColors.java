class SortColors {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0 ){
            return;
        }

        int n=nums.length;
        int l=0, m=0, r=n-1;

        while(m<=r){
            if(nums[m] == 2){
                swap(nums, m, r);
                r--;
            } else if(nums[m] == 0){
                swap(nums, l, m);
                l++;
                m++;
            } else {
                m++;
            }
        }
    }

    void swap(int[] nums, int i, int j){
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
