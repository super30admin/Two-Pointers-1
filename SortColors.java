
/*

Brute force: 
Simple search, run time = O(nlog(n));
or Counting Sort, count occurences of 0,1,2's and refill the array

Or we can use two pointers and have a run time of O(N);
Can use low,high pointers to track here the sorted 0's are with low and where high are with 1's.


*/


class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int low = 0; int mid = 0; int high = nums.length-1; 
        while(mid <= high){
            if(nums[mid] == 1){
                mid++;
            }else if(nums[mid] == 0){
                swap(nums,low,mid);
                mid++;
                low++;
            }else{
                swap(nums,high,mid);
                high--;
            }
        }
        
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}



