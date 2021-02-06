class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0){
            return;
        }
        int left=0;
        int right= nums.length-1;
        int current=0;

        while(current<=right){
            if(nums[current]==0){
                swap(nums,current, left);
                left+=1;
                current+=1;
            }
            else if(nums[current]== 1){
                current+=1;
            }
            else{
                swap(nums, current, right);
                right-=1;
            }
        }
    }
    private void swap(int[] nums, int i , int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
//time complexity= o(n)
//space complexity=o(1)