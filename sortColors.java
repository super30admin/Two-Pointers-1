//Time complexity - O(n)
// Space complexity - O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
//idea is to use 3 pointers. Left collects all the 0's. Mid iterates and collects all 1's. Right collects all 2's
class Solution {
    
    static void swap(int[] arr, int num1, int num2){
        
        int temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
    }
    public void sortColors(int[] nums) {
        
        if(nums.length == 0 || nums == null){return;}
        
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;
        
        
       while(mid <= right){
            
            if(nums[mid] == 0){
                
                swap(nums,mid,left);
                
                left ++;
                mid ++;
              
                
            }
            
            else if(nums[mid] == 2){
                
                  swap(nums,mid,right);
                
               
                right --;
               
            }
            
            else if(nums[mid] == 1){
         //         swap(nums,nums[mid],nums[right]);
                
                mid ++;
               
                
            }
        }
        
    }
}