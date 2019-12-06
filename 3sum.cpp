//three sum 
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        if (nums.empty() || nums.size() < 3) return {};   //edge case

        sort(nums.begin(), nums.end());    //sort the vector
        vector<vector<int>>result;          //output vector

        for(int i = 0; i < nums.size()-2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int low = i+1;
                int high = nums.size() - 1;
                int sum = 0 - nums[i];


            while(low < high){
                if(nums[low] + nums[high] == sum){
                    result.push_back(vector<int>{nums[i], nums[low], nums[high]});
                    while(low < high && nums[low] == nums[low+1]) low++; //checking for duplicates
                    while(low < high && nums[high] == nums[high-1])high--;
                    low++;
                    high--;
                }else if(nums[low] + nums[high] > sum){
                    high--;
                } else{
                        low++;
                    }
            }
         }
        }
        return result;
    }
};

//Time complexity: O(n^2)
//Space complexity: O(1)
