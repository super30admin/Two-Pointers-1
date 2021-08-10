//Time Complexity - O(n^2)
//Space Complexity - O(1)
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>>v;
        int n=nums.size();
        if(n==0)
            return v;
        sort(nums.begin(),nums.end());
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            int low=i+1,high=n-1;
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum==0){
                    vector<int>v1;
                    v1.push_back(nums[i]);
                    v1.push_back(nums[low]);
                    v1.push_back(nums[high]);
                    v.push_back(v1);
                    low++;
                    high--;
                    while(low<high&&nums[low]==nums[low-1]){
                        low++;
                    }
                    while(low<high&&nums[high]==nums[high+1]){
                        high--;
                    }
                }
                else if(sum<0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return v;
    }
};