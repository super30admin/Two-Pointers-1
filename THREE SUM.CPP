//TC-O(NLOGN+N^2)
//SC-O(1)
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        if(nums.size() < 3)return {};
       int target=0;
        sort(nums.begin(),nums.end());
        vector<vector<int>> result;
        for(int i=0;i<=nums.size()-3;i++){
             if(i == 0 || (i>0 && nums[i] != nums[i-1])){
            int j=i+1;
            int k=nums.size()-1;
         
            while(j<k){
                   int current_sum=nums[i]+nums[j]+nums[k];
                
                   if( current_sum>0)
              k--;
            
                    if( current_sum<0)
              j++;
        
            
            if( current_sum==0){
                result.push_back({nums[i],nums[j],nums[k]});
                j++;k--;
                 while(j<k && nums[j] == nums[j+1])j++;
                 while(j<k && nums[k] == nums[k-1])k--;  
            
            }
            }                             }
        }
                                                
                
                                 
        return result;
    
    }
};