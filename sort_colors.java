//Time complexity = O(n)
//Space complexity = O(1)
//Intuit Interview question
//Brute force:using count
//2.using sorting the given array
//3.pointers
//keep a record using the 3 pointer,low is keeping the track of the index and mid should be less than =high.If encountered for example 2 already pushed toward rightand there are two options. option one either have 1 case move forward else option 0 push towards left.

//optimal approach:Here using 3 pointer compare with red white and blue with respect to the integer 0,1 and 2.starting from the given array the starting value zera index is pointer to pointer low and mid and it compares with high .If the current value is less than the index 1 value it will swap the value and increment. 
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        
        int low = 0, mid = 0, high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;
            } else if(nums[mid] == 1){
                mid++;
            } else{
                swap(nums,mid,high);
                high--;
            }
            
        }
        
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}