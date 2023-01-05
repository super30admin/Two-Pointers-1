//TC:N2LOGN
//SC: 0(1)

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        int index=0;
        for(int i=0;i<nums.size();i++){
            cout<<i;
            int target = -nums[i];
            int low = i+1;
            int high = nums.size()-1;

            while(low<high){
                if(nums[low]+nums[high]==target){
                    vector<int> triplet(3);
                    triplet[0] = nums[i];
                    triplet[1] = nums[low];
                    triplet[2] = nums[high];
                    ans.push_back(triplet);
                    while(low<high && nums[low]==triplet[1]){low++;}
                    while(low<high && nums[high]==triplet[2]){high--;}

                }
                else if(nums[low]+nums[high]<target){
                    low=low+1;
                }
                else{
                    high=high-1;
                }
            }
            while(i+1<nums.size() && nums[i]==nums[i+1]){
                i++;
            }
        }
    return ans;

    }
};
