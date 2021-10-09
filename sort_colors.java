// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
public void sortColors(int[] nums) {
    if(nums == null || nums.length == 0) return;
    //We take two pointers at the ends of the array and one current pointer to keep track of the 
    //current value
    int left = 0, right = nums.length - 1, curr = 0;
    
    while(curr <= right){

        if(nums[curr] == 0){
            //we swap the value with the left one as 0 is the least of 0,1,2 and we won't have values less than 0
            swap(nums,curr,left);
            left++;
            curr++;
        }
        else if(nums[curr] == 1)curr++;
        else{
            //If the value is 2, we swap with the right value as 2 is the highest in 0,1,2 order. We won't
            //have any value larger than 2
            swap(nums,curr,right);
            right--;
        }
    }
}
//Element swap logic using a temp variable
private void swap(int[] nums, int left, int right){
    int temp = nums[left];
    nums[left] = nums[right];
    nums[right] = temp;
}