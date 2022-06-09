//Time Complexity- O(n^2)
//Space Complexity- O(1)

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        
        vector<vector<int>> ans;
        if(nums.size()<=2){
            return ans;
        }
        sort(nums.begin(),nums.end());
        
        for(int i=0;i<nums.size()-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            if(nums[i]>0){
                break;
            }
            int num=nums[i];
            int left=i+1;
            int right=nums.size()-1;
            while(left<right){
                if(nums[left]+nums[right]+num==0){
                    ans.push_back({num,nums[left],nums[right]});
                    left++;
                    right--;
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(left<right && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                else if(nums[left]+nums[right]+num>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return ans;
    }
};