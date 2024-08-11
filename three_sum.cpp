// time : O(nlogn)+o(n2) --> o(n2)
// space: o(1). No extra space besides result array

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;

        sort(nums.begin(), nums.end());

        for(int i = 0; i < nums.size(); i++)
        {
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            int num1 = nums[i];

            // target for 2 sum 
            int target = -1*num1;

            int p1 = i+1;
            int p2 = nums.size() - 1;

            while(p1 < p2)
            {
                int total = nums[p1] + nums[p2];
                if( total == target)
                {
                    // we found the triplet
                    result.push_back({nums[i], nums[p1], nums[p2]});
                    p1++;

                    // keep updating p1 and p2 until we find a new number 
                    // to avoid duplicate triplets
                    while(p1 < nums.size() && nums[p1] == nums[p1-1])
                    {
                        p1++;
                    }

                    p2--;
                    while(p2 > 0 && nums[p2] == nums[p2+1])
                    {
                        p2--;
                    }
                }
                else if(total < target)
                {
                    p1++;
                }
                else{
                    p2--;
                }
            }

        }

        return result;
    }
};