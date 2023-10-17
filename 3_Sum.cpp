class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
    int n = nums.size();
    vector<vector<int>> results;
    sort(nums.begin(), nums.end());
    for( int i =0;i<n-2;i++){
        if(i>0 && nums[i]==nums[i-1])continue;
        int l = i+1;
        int r= n-1;
        while(l<r){
            int currSum = nums[i]+nums[l]+nums[r];
            if(currSum==0){
                results.push_back({nums[i], nums[l], nums[r]});
                l++;
                r--;
                while(l<r && nums[r]== nums[r+1]){
                r--;
            }
            while(l<r && nums[l]== nums[l-1]){
                l++;
            }
            }
            
            else if(currSum > 0){
                r--;
            }
            else{
                l++;
            }
        }

    }
    return results;   
    }
};




//sort(nums.begin(), nums.end());
        
        
    //     vector<vector<int>> result;
    //    // if(nums[0]>0)return {};
    //    // if(nums.size()<3)return{};
    //     for(int i=0;i<nums.size()-2;i++){
        
    //     int low=i+1;
    //     int high = nums.size()-1;
    //     int target = -nums[i];
    //     if (i > 0 && nums[i] == nums[i - 1]) {
    //             continue; // Skip duplicates
    //         }
    //     while(low<high){
    //         int sum = nums[low]+ nums[high];
    //         if(target>sum){
    //             low++;
    //         }else if(sum>target){
    //             high--;
    //         }
    //         else{
    //             result.push_back({nums[i], nums[low], nums[high]});
    //             while(low<high && nums[low]==nums[low+1]) low++;
    //             while(low<high && nums[high]==nums[high-1]) high--;
    //             low++;
    //             high--;
    //         }
    //     }
    //     }
    //    return result; 
