//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution {
    public void sortColors(int[] nums) {
        
        int size = nums.length;
        
        int low = 0; int mid = 0; int high = size - 1;
        
        while(mid <= high){
            
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++; mid++;
            } else if(nums[mid] == 2){
                swap(nums, high, mid);
                high--;
            }
            else{
                mid++;
            }
            
        }
        
    }
    
    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
