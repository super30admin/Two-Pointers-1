//Time Complexity: O(n)
//Space Complexity: O(1).

//This problem can be solved by using the technique of linear search with the count variable. The time comlexity in that case is O(n) = O(n) + O(n) + O(n). Therefore, for reducing the time complexity, the use of three pointers is needed. 


class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        
        while(mid <= high){
            if(nums[mid] == 0){     //for the color red
                swap(nums, low, mid);
                mid ++; 
                low ++;
            }
            else if(nums[mid] == 1){  ///for the color white
                mid++;
            }
            else
            {
                swap(nums, mid , high);  
                high--;
            }
                
        }
    
    }
    
    private void swap(int[] nums, int first, int last){
        int temp = nums[first];
        nums[first] = nums[last];
        nums[last] = temp;
        
        
    }
}