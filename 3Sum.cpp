//3Sum.cpp
//Two pointer approach
/*
1. Sort array
2. Keep two pointers left pointing to current+1, right pointing to end of array. Calculate sum of numbers at indexes current , left and right.
3. If sum is zero add the three numbers to output array and increment left and right. Keep checking for unique elements and increment pointers accordingly.
4. if sum is less than zero, increment left pointer.
5. if sum is greater than zero, keep incrementing to right.

TC: O(N^2)
SC: O(1)
*/

#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        if(nums.size()<3)
            return vector<vector<int>>();
        vector<vector<int>> output;
        sort(nums.begin(),nums.end());
        for(int i = 0; i < nums.size() - 2; i++){
            //check for uniques
            if(i != 0 && nums[i-1]==nums[i]) continue;
        
            int l = i+1, r=nums.size()-1;
            
            while(l < r){
                int currSum = nums[i] + nums[l] + nums[r];
                if(currSum == 0){
                    vector<int> temp;
                    temp.push_back(nums[i]);
                    temp.push_back(nums[l]);
                    temp.push_back(nums[r]);
                    output.push_back(temp);
                    l++;
                    //unique
                    while(l < r && nums[l-1] == nums[l]) l++;
                    r--;
                    //unique
                    while(r > l && nums[r] == nums[r+1]) r--;
                }
                
                else if(currSum < 0){
                    l++;
                    //unique
                     while(l < r && nums[l-1] == nums[l]) l++;
                }
                else if(currSum>0){
                   r--;
                   //unique
                   while(r > l && nums[r] == nums[r+1]) r--;
                }
                
            }
        }
        return output;
    }
};

int main(int argc, const char * argv[]) {
    vector<int> nums={-1, 0, 1, 2, -1, -4};
    vector<vector<int>> output;
    Solution s;
    output = s.threeSum(nums);
    for(auto i:output){
        for(int j:i){
            cout<<j<<"\t";
        }
        cout<<endl;
    }
    std::cout <<"\n";
    return 0;
}
