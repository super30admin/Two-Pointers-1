////Problem 75 : Sort sortColors
//solved successfully on leetcode and faced no issues
//approach : We use three pointers: low which collects all 0's, mid to traverse the array and which collects all 1's, and high pointer which collects all 2's.
//If nums[mid] is 0, we swap with low and increment both low and mid; if it's 2, we swap with high and decrement high; if it's 1, we just increment mid.
//TC: O(n) , SC = O(1)
class Solution {
    public void sortColors(int[] nums) {
        //low pointer collects all 0's , mid pointer collects all 1's and high pointer collects all 2's
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }

        
    }
    private void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}