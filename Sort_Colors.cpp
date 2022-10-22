/*
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/
class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n = nums.size();
        int l = 0, r = n-1, i = 0;
        while(i<=r){
            if(nums[i]==0){
                swap(nums,l,i);
                l++; i++;
            } else if(nums[i]==2){
                swap(nums,r,i);
                r--;
            } else{i++;}
        }
    }
    void swap(vector<int>& nums, int l, int i){
        int temp = nums[l];
        nums[l] = nums[i];
        nums[i] = temp;
    }
};