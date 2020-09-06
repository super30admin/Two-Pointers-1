// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach


class Solution {
public:
    void sortColors(vector<int>& nums) {
        int zero = 0;
        int two = nums.size()-1;
        int comp = 0;
        
       while(comp<= two){

       // we will swap 0 with the current of we find the nums[comp ] = 0
           if (nums[comp] == 0){
               swap(comp, zero, nums);
               comp +=1;
               zero+=1;
               // if the current values is 2 then we swap with the position of pointer of 2.
           } else if (nums[comp] == 2){
               swap(comp, two, nums);
               two -=1;
           }else comp +=1;
       } 
        
    
        
    }
    
    void swap(int i, int j, vector<int>& nums){
            int temp = nums[i];
            nums[i] = nums[j]; // swapping the values here in the given array
            nums[j] = temp;
        }
};