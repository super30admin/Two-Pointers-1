// Sort colors
// solved on leetcode
// Time complexity - O(n)
// Space complexity - O(1)
class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        
        while(mid<=right){
            if(nums[mid]==0){
                swap(nums,left,mid);
                mid++;
                left++;
            }else if(nums[mid]==2){
                swap(nums,right,mid);
                right--;
            }else{
                mid++;
            }
        }
    }
    public void swap(int[] nums,int leftIndex,int rightIndex){
        int temp=nums[leftIndex];
        nums[leftIndex]=nums[rightIndex];
        nums[rightIndex]=temp;
    }
}