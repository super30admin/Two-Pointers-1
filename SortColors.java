// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yess
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach: We took three points Low for 0, mid for 1 and high for 2. 

class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        int n= nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums, mid, high);
                high--;
            }
            else{
                mid++;
            }
        }
    }

    public void swap(int nums[], int i, int j){
        int temp= nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

