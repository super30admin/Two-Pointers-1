//75. Sort Colors

/*
Use three pointers, one to track zeros, another to track ones and another to track twos

Time complexity: O(N)
Space complexity: O(1)

*/

class Solution {
public:

    void swapEle(vector<int>&nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void sortColors(vector<int>& nums) {
        
        int zero = 0, one = 0, two = nums.size()-1;
        
        while(one <= two){
            
            if(nums[one] == 0){
                swapEle(nums, zero, one);
                zero++;
                one++;
            }
            else if(nums[one] == 2){
                swapEle(nums, one, two);
                two--;
            }
            else{
                one++;
            }          
            
        }        
        
     }
};