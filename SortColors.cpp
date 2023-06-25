// Time Complexity: O(n) 
// Space Complexity: O(1)

class Solution {
public:
    void sortColors(vector<int>& nums) {
      int px0 = 0; 
      int px2 = nums.size()-1; 
      int i = 0; 

      while(i <= px2) {
        if(nums[i] == 0) {
          swap(nums[i], nums[px0]);
          px0++;
          i++;
        } else if(nums[i] == 2) {
          swap(nums[i], nums[px2]);
          px2--;  
        } else i++; 
      }   
    }
};