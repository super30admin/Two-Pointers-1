class SortColorsTwoPointers {
    //Using swap func and taking left, right , mid three variable.
    //TC will be O(n), as traverisng only once.
    //SC will be O(1), no extra spcae used.
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0){
            return;
        }

        int left=0;
        int right=nums.length-1;
        int mid=0;

        while(mid<=right){
            if(nums[mid]==2){
                swap(nums, mid, right);
                right--;
            }
            else if(nums[mid]==0){
                swap(nums, mid, left);
                left++;
                mid++;
            }
            else{
                mid++;
            }

        }
        for(int num:nums){
            System.out.println(num);
        }
    }

    private void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }


    public static void main(String[] args){
        SortColorsTwoPointers obj = new SortColorsTwoPointers();
        int[] nums = {2,0,2,1,1,0};
        obj.sortColors(nums);
    }
}