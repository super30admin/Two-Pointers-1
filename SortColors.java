// Time Complexity : The time complexity is O(n) where n is the length of the array.
// Space Complexity : The space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {

        int start = 0; // Start pointer at which "0"s are added
        int end = nums.length-1; // End pointer at which "2"s are added
        int i=0; //  pointer which iterates from through the length of the array

        while(i <= end){

            // If the number of 0, swap with the start index
            if(nums[i] == 0){
                swap(nums,i,start);
                start++;
                i++;
            }
            // If the number is 0, swap with end end index
            else if(nums[i] == 2){
                swap(nums,i,end);
                end--;
            }
            // If the number is 1, increment i
            else{
                i++;
            }
        }

    }

    public void swap(int[] nums,int x,int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}