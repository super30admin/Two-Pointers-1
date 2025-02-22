#include<bits/stdc++.h>
#include<iostream>
#include<vector>
#include<algorithm>
#include<map>
using namespace std;
void sortColors(vector<int>& nums) {
    int i = 0,n = nums.size(),k=n-1;
    for(int j=0;j<=n-1;j++){
        if(nums[j]==0){
            swap(nums[i],nums[j]);
            i++;
        }     
    }
    i = n-1;
    for(int j=n-1;j>=0;j--){
        if(nums[j]==2){
            swap(nums[i],nums[j]);
            i--;
        }
    }
}
int main(){
    vector<int> nums = {2,0,2,1,1,0};
    sortColors(nums);
    for(int i=0;i<nums.size();i++){
        cout<<nums[i]<<" ";
    }
    return 0;
}
// Time Complexity: O(n)
// Space Complexity: O(1)
// Input: [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]