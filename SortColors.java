//Time Complexity: O(n)
//Space Complexity: O(1)
//Since we have three different colors to sort in this probelm and we cannot use the approach of counting the occurances of each number, 
//we make use of three pointers to solve this problem. Both the low and the mid pointers are set to 0 in the beginning and the high pointer 
//is at the last index. We keep moving the mid pointer and based on the element at its position, we either swap it with the low pointer(if it is 0),
//continue moving forward(if it is 1) or swap it with the high pointer(if it is 2). We cotinue doing this till our mid pointer is less
//than or equal to the high pointer and we are able to sort the given array

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int low = 0; int high = nums.length - 1;int mid = 0;
        while(mid <= high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else{
                mid++;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}