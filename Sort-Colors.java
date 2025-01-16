// ## Problem1 (https://leetcode.com/problems/sort-colors/)
// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]

// Approach 1: Brute Force
// Time Complexity :O(n2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void sortColors(int[] nums) {
        //base condition
        if(nums==null || nums.length==0){
            return;
        }
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        
    }
}

// Approach 2: 
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public void sortColors(int[] nums) {
        //base condition
        if(nums==null || nums.length==0){
            return;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
         int index=0;
        for(int i=0;i<=2;i++){
            int temp=map.getOrDefault(i,0);
            for(int j=0;j<temp;j++){
                nums[index]=i;
                index++;
            }
        }
    }
}

// Approach 3:
// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//Approach : In this approach We are keeping 3 pointers left, right,mid where left & mid are initialized at 0 and right at n-1
// If we get nums[mid]==2 we will swap right and mid and decrement right
// If we get nums[mid]==0 we will swap left and mid and increment both
// If we get nums[mid]==1 we will just increment mid
// we will keep doing this until mid<=right
class Solution {
    public void sortColors(int[] nums) {
        //base condition
        if(nums==null || nums.length==0){
            return;
        }
        int n=nums.length;
        int left=0;
        int right=n-1;
        int mid=0;
        //while loop
        while(mid<=right){
            if(nums[mid]==2){
                swap(nums,mid,right);
                right--;
            }
            else if(nums[mid]==0){
                swap(nums,mid,left);
                left++;
                mid++;
            }
            else{
                mid++;
            }
        }
    }
    private void swap(int[] nums, int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}