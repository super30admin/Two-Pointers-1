// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

//Time Complexity : O(n) since we are iterating through the array
//Space Complexity: O(1) since we are not taking any extra space

 public void sortColors(int[] nums) {
        
        //[2,0,2,1,1,0]
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        
        while(mid <= right){
            
            if(nums[mid] == 0){ // swap elements in mid and left pointers as lowest element should be on the left
                swap(nums,mid,left);
                left++;
                mid++;
            }
            else if(nums[mid] == 2){ // swap elements in mid and right pointers since highest element should be on the right
                swap(nums, mid, right);
                right--;
            }
            else{
                mid++;
            }
        }      
    }
    
    private void swap(int[] nums, int leftIndex, int rightIndex){
        
        int temp = nums[leftIndex];
        nums[leftIndex] = nums[rightIndex];
        nums[rightIndex] = temp;
    }
