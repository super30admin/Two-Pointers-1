class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        
        vector<vector<int>> ans;
       int n = nums.size();
        sort(nums.begin(),nums.end());

        for(int i = 0;i<n-2;i++){

            // if(nums[i]>0) break;
            int start = i+1;
            int end = n-1;
            if(i>0 && nums[i] == nums[i-1]){
          
                continue;
               
                }
      
            
        while(start<end){
            if(nums[i]+nums[start]+nums[end] == 0){
                  ans.push_back({nums[i],nums[start],nums[end]});
                 start++;
                end--;

                while(start<end && nums[start] == nums[start-1]) {start++;}

                while(start<end && nums[start] == nums[end+1]) {end--;}
              
               
            }
            else if(nums[i]+nums[start]+nums[end]>0){
                end--;
            }
            else{
                start++;
                }
            }
        }

        return ans;
    }
};

//Time complexity : n^2logn