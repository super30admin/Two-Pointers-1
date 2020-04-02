// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

//1.Edge case
//A. return when size is 0 or 1
//B.  return when size is 2
//2. Sort
//A.check if mid pointer is 1 then proceed with no action,  increment mid
//B check if mid pointer is 0 then swap with low pointer, increment mid
//B. check if mid pointer is 2 then swap with high pointer, dont increment mid
class Solution {
   void sort_using_two_pointers(vector<int>&  nums){
       
       int low_pointer = 0;
       int high_pointer = nums.size()-1;
       int mid_pointer = 0;
       
       while( mid_pointer <= high_pointer){
           //2.A
           if(nums[mid_pointer] == 1)
            {
                mid_pointer++;
            }
           else if(nums[mid_pointer] == 0 ){
               swap(nums[low_pointer], nums[mid_pointer] );
               low_pointer++;
               mid_pointer++;
           }
         else if(nums[mid_pointer] == 2 ){
               swap(nums[high_pointer], nums[mid_pointer] );
               high_pointer--;
           }
            
       }
   }
public:
    void sortColors(vector<int>& nums) {
        //1.A
        if(nums.size()==0 || nums.size()==1){
            return;
        }
        //1.B
        if(nums.size()==2){
            if(nums[0]>nums[1]){
                swap(nums[0],nums[1]);
            }
            return;
        }
        
        //2. 
        return sort_using_two_pointers(nums);
    }
};
