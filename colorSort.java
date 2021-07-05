//TimeComplexity:O(N)
//Space Complexity:O(1)
//In this problem, I first initialize my left and right pointer to be equal to 0 and length of the array -1 respectively. When my array[i]=0, I'll be swapping array[i] with the element in my left index and increment my left index. If my array[i]=2, I'll swap the element in my array[i] with my right index and decrement my right pointer. In this step I'll also be decrementing my index, so that none of the elements remain unsorted while swapping. 
//This code was successfully executed and got accepted in leetcode.
class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int r=nums.length-1;
        for(int i=0;i<=r;i++){
            if(nums[i]==0){
                int temp=nums[i];
                nums[i]=nums[l];
                nums[l]=temp;
                l++;
            }
            if(nums[i]==2){
                int temp=nums[i];
                nums[i]=nums[r];
                nums[r]=temp;
                r--;
                i--;
            }
        }
    }
}