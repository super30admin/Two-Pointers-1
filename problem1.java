public class problem1 {
    public void sortColors(int[] nums) {
// Time Complexity : O(n logn) n-> number of elements in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
        if(nums == null || nums.length == 0) return;
        
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        
        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums,mid,high);
                high--; // why not mid++, becuase some cases will fail like[2,0,2,1,1,0]
            }else if(nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else{
                mid++;
            }
        }
       
    }
     
        public void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}
