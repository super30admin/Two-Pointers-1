//Time comlpexity - O(nlogn)+)(n^2)
//Space complexity - O(1)
//Ran successfully on leetcode
//3 point approach is the following -
//1. First we sort the array in nlogn. Then run one outer loop and one inner loop for the rest of the array with two pointers, one in the beginning and one in the end
//2. Calculate the sum for the 3 positions and move the pointers based on the distance from target i.e. 0 here. If sum is 0, then we add to the result array.
//3. To avoid duplicates, iterate the low and high pointers until the elements are not same as the previous element.

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>>result;
        if(nums.empty())
            return result;
        sort(nums.begin(),nums.end()); //O(nlogn)
        //Basically we have 3 pointers i.e i,l,h
        for(int i=0;i<nums.size();i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            int l=i+1,h=nums.size()-1;
            while(l<h)
            {
                int sum=nums[i]+nums[l]+nums[h];
                if(sum>0)
                    h--;
                else if(sum<0)
                    l++;
                else if(sum==0)
                {
                    //Push into result vector
                    result.push_back({nums[i],nums[l],nums[h]});
                    l++;
                    h--;
                    while(l<h && nums[l]==nums[l-1])
                        l++;
                    while(l<h && nums[h]==nums[h+1])
                        h--;
                }
            }
        }
        return result;
    }
};