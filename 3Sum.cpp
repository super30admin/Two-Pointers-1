//Time = O(N*N)
//Space = O(1)
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        if(nums.size()==0) return result;
        int n = nums.size();
        sort(nums.begin(), nums.end());
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i-1]==nums[i]) continue; //outside duplicates
            if(nums[i]>0) break; //Once we cross 0, we will never find a solution anyways
            int left = i+1;
            int right = n-1;
            while(left<right){
                int curSum = nums[left]+nums[right]+nums[i];
                if(curSum==0){
                    result.push_back({nums[i],nums[left],nums[right]});
                    left++; right--;
                    while(left<right && nums[left]==nums[left-1]) left++; //duplicates inside
                    while(left<right && nums[right]==nums[right+1]) right--; //optimizing
                }else if(curSum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
};
