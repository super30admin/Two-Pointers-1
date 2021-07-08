// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        
    int low = 0;
    int mid = 0;
    int high = nums.length -1;
        while(mid <=  high )
        {
            if(nums[mid] == 0)
            {
                nums = swap(nums,low,mid);
                low++;
                mid++;
               
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                nums = swap(nums,mid,high);
                high--;
                
            }
        }
        
        
    }

    private int[] swap(int[] nums, int a ,int b){
         int temp = nums[a];
         nums[a] = nums[b];
         nums[b] = temp;
        return nums;
    }
}