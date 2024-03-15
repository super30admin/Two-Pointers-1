// Time Complexity : O(n)             
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Leet code : https://leetcode.com/problems/sort-colors/description/

Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, 
with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
*/

/*
Using Three Pointer technique
We are not allowed to use any sorting technique or extra space
*/

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int left = 0;
        int right = nums.size()-1;
        int mid = 0;

        while(mid <= right){
            if(nums[mid] == 0){
                std::swap(nums[left], nums[mid]);
                mid++;
                left++;
            } else if(nums[mid] == 2){
                std::swap(nums[mid], nums[right]);
                right--;
            } else {
                mid++;
            }
        }    
    }
};