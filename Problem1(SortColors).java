/* Algorithm:
    1. Traverse through the array, take three pointers low, mid and high
    2. If nums[mid]==0, swap the element with the element at low pointer then move both low and mid pointer forward. If nums[mid]==1, move mid pointer forward.
    3. If the nums[mid]==2 the swap with nums[mid] with nums[high] reduce the high pointer by 1
    
    
    Time Complexity: O(n)
    Space Complexity: O(1)
    
    Did the solution run on leetcode? Yes


*/

class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==0 || nums==null)
            return;
        
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        
        while(mid<=high){
            
            //case 1 when nums[mid]==0
            if(nums[mid]==0){
                swap(nums, low, mid);
                low++;
                mid++;
                
            }
            //case 2 when nums[mid]==1
            else if(nums[mid]==1){
                mid++;
            }
            //case 3 when nums[mid]==2
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }
        
        
        
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]=temp;
        
    }
}