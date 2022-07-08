// TC: O(n)
// SC: O(1)

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        int left = 0;
        int right = nums.length -1;
        int mid = 0;
        
        while(mid<=right){
            // if we find a 0 then we swap witht the value at left
            if(nums[mid] == 0){
                swap(nums,mid,left);
                mid++;
                left++;
            }
            else if(nums[mid]==1){
                // dont swap anything just continue
                mid++;
            }
            else{
                // swap with the value at right witgh value at mid
                swap(nums,mid,right);
                right--;
            }
        }
    
    }
    private void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            
        }
    }
