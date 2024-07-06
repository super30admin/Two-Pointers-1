// time: O(n2)
// space: O(1)
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        sort(nums.begin(), nums.end());
        for(int i = 0; i < nums.size()-2; i++) {
            if(nums[i] > 0) {
                break;
            }
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            int sumNeeded = 0 - nums[i];
            int j = i+1;
            int k = nums.size()-1;
            while(j < k) {
                cout<<i<<" "<<j<<" "<<k<<endl;
                if(nums[j]+nums[k] == sumNeeded) {
                    vector<int> triplet;
                    triplet.push_back(nums[i]);
                    triplet.push_back(nums[j]);
                    triplet.push_back(nums[k]);
                    result.push_back(triplet);
                    
                    while(j < k && nums[j] == nums[j+1]) {
                        j++;
                    }
                    j++;
                    while(j < k && nums[k] == nums[k-1]) {
                        k--;
                    }
                    k--;
                }
                else if(nums[j]+nums[k] < sumNeeded) {
                    while(j < k && nums[j] == nums[j+1]) {
                        j++;
                    }
                    j++;
                }
                else {
                    while(j < k && nums[k] == nums[k-1]) {
                        k--;
                    }
                    k--;
                }
            }
        }
        return result;
    }
};