// Time Complexity : O(n) where n is the length of the input array nums for one pass sorting of colors
//  Space Complexity : O(1) : no extra space used
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
// Three line explanation of solution in plain english:
//1. We use a three-pointer approach to sort the colors in a single pass.
//2. The pointers p1 and p2 track the current position for 0s and 1s, while p3 tracks 2s.
//3. We swap elements to their correct positions based on their color value.

class Solution {
    public void sortColors(int[] nums) {
        // Initialize three pointers: p1 for 0s, p2 for 1s, and p3 for 2s
        int p1=0, p2=0;
        int p3=nums.length-1;
        // Iterate through the array until p2 exceeds p3
        while (p2<=p3){
            // If the current element is 1, just move p2 forward
            if (nums[p2]==1){
                p2++;
            }
            // If the current element is 0, swap it with p1(so that the 0s are at the beginning) and move both pointers
            else if(nums[p2]==0){
                swap(nums,p1,p2);
                p1++;
                p2++;
            
            }
            // If the current element is 2, swap it with p3(so that the 2s are at the end) and move p3 backward
            else{
                swap(nums,p2,p3);
                p3--;
            }
        }
    }
    // Helper method to swap two elements in the array
    public void swap(int nums[],int s1, int s2) 
    {
        int temp=nums[s1];
        nums[s1]=nums[s2];
        nums[s2]=temp;
    }
}