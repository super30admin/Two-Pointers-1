//
// Created by shazm on 7/21/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

class Solution{
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> retVec;
        if(nums.size()<3){
            return retVec;
        }
        int start; int end;
        sort(nums.begin(),nums.end());

        for(int x = 0; x<nums.size()-2; x++){
            if(x==0 || nums[x]>nums[x-1]){
                start = x+1;
                end = nums.size()-1;
                while(start<end){
                    if((nums[start]+nums[end]+nums[x])==0){
                        vector<int> vec{nums[x],nums[start],nums[end]};
                        retVec.push_back(vec);
                    }
                    if((nums[start]+nums[end]+nums[x])<0){
                        int temp = nums[start];
                        while(temp==nums[start] && start<end){
                            start++;
                        }
                    }else{
                        int temp = nums[end];
                        while(temp==nums[end] && start<end){
                            end--;
                        }
                    }
                }
            }
        }

        return retVec;
    }
    }
};

int main(){
    Solution s;

    vector<int> vec{-1, 0, 1, 2, -1, -4}; // {-4,-1,-1,0,1,2}
    vector<vector<int>> vec2 = s.threeSum(vec);

    for(int i =0; i<vec2.size(); i++){
        for(int j =0 ; j<vec2[0].size(); j++){
            cout<<vec2[i][j]<<" ";
        }
        cout<<endl;
    }
    return 0;
}