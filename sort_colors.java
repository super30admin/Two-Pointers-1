//TimeComplexity O(n)
//SpaceComplexity O(1)

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0; 
        int high = nums.length - 1;
        while(mid <= high){
           if(nums[mid] == 2){
               swap(nums, high, mid);
               high--;
           }else if(nums[mid] == 0){
               swap(nums,low, mid);
               mid++;
               low++;
           }else{
               mid++;
           }
           }
        }
    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
