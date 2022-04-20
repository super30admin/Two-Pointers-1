//time complexity : o(n2 ) and space complexity is O(1)
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        
        vector<vector<int>> result;
        int n = nums.size();
        //sort the array.
        sort(nums.begin(),nums.end());
        
        for(int  i = 0; i<n; i++) {
            //dupliacte values conditions.
            if(i > 0 && nums[i] == nums[i-1])  continue;
            vector<int> temp;
            int left = i+1;
            int right = n-1;
            
            //2 pointer Technique.
            while(left < right) {
                vector<int> temp;
                if(nums[i] + nums[left] + nums[right] == 0) {
                    temp = {nums[i], nums[left], nums[right]};
                     result.push_back(temp);
                    left++;
                    right--;
                    
                     while( left < right && nums[left] == nums[left-1]) {
                        left++; 
                     }
                    
                    while(left < right && nums[right] == nums[right+1]) { 
                        right--; 
                     }
                    
                } else if(nums[i] + nums[left] + nums[right] > 0) {
                        right--;
                    } else {
                        left++;
                      }
            }
        }
       return  result;
        
    }
};