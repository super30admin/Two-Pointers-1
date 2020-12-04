//Time complexity - O(n^2)
//Space complexity - O(1)

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> ret;
        int tempf,tempb;
        int target,f,b;
        
        for(int i=0;i<nums.size();i++){
            
            f = i+1;
            b = nums.size()-1;
            
            
            while(f<b){
                if(nums[f]+nums[b]<-nums[i]){
                    f++;
                }else if(nums[f]+nums[b]>-nums[i]){
                    b--;
                }else{
                    tempf = nums[f];
                    tempb = nums[b];
                    ret.push_back({nums[i],nums[f],nums[b]});
                    while(f<b && tempf == nums[f]) f++;
                    while(f<b && tempb == nums[b]) b--;
                }
            }
            
            while(i<nums.size()-1 && nums[i] == nums[i+1]) i++;
            
        }
        
        return ret;
        
    }
};
