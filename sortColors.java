class SortColors {
    public int[] sortColors(int[] nums) {
        int low =0;
        int mid =0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
        }
        return nums;
    }

    private void swap(int [] nums,int k,int z){
        int temp = nums[k];
        nums[k] = nums[z];
        nums[z] = temp;
    }
    public static void main(String[] args){
        SortColors s = new SortColors();
        int [] nums = {0,2,0,1,1,1,2,2,2,0,0,0};
        s.sortColors(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}