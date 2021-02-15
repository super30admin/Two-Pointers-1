// T: O(n)  worst case we travel entire array
// S: O(1) in place sorting

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null)
            return;
        int left = 0; // pointer to 0 boundary
        int right = nums.length - 1;//pointer to 2 boundary
        int curr = 0; //pointer to traverse array
        
        while(curr <= right){
            if(nums[curr] == 1){
                curr++;
            }
            else if(nums[curr] == 2){
                //swap with right boundary and decrease 
                swap(nums, curr, right);
                right--;
            }
            else{ 
                //if number is 0 => swap  with left boundary
                swap(nums, curr, left);
                curr++;
                left++;
            }                
        }        
    }
    
    private void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}