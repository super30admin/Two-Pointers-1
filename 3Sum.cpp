//3 Sum

/*
First sort the numbers
Iterate and pick first element, then use 2 pointers to get other two numbers
Conditions to check
1. if first number is greater than 0, break out of the loop
2. check outside duplicacy
3. check inside pairs duplicacy
4. check left and right pointers condition again when checking for duplicates

Time complexity: Sorting + first element*2 sum = O(nlogn) + O(n*n)= O(n^2)
Space complexity: O(n)


*/

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {

        vector<vector<int>> ret;
        sort(nums.begin(), nums.end());

        for(int i=0; i<nums.size()-2; i++){
            if(nums[i] > 0) break;

            //check outside duplicacy
            if( i != 0 && nums[i] == nums[i-1]) continue;

            int l=i+1, r=nums.size()-1;
            while(l<r){
                int currSum = nums[i]+nums[r]+nums[l];
                if(currSum == 0) {
                    //got triplet
                    ret.push_back({nums[i], nums[r], nums[l]});
                    r--;
                    l++;

                    while(nums[l] == nums[l-1] && l<r) l++;
                    while(nums[r] == nums[r+1] && l<r) r--;
                }
                else if(currSum < 0) l++;
                else r--;

            }
        }

        return ret;
    }
};