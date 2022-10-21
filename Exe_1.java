class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int i = 0;
         while(i<=r){
             if(nums[i] == 0){
             swap(nums,i,l);
             ++i;
             ++l;
         }else if (nums[i] ==2){
             swap(nums,i,r);
             --r;
         }else{
             ++i;
         }
    }}
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] =temp;
    }
}
//tc=O(n)
//sc=O(1)
