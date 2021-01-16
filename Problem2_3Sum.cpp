// Time Complexity : O(n) where n is number of elements
// Space Complexity : O(1) we are not using extra space
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


#include<vector>
#include<bits/stdc++.h>
#include<stdlib.h>
#include<cmath>
#include<time.h>
#include<iostream>

using namespace std; 
class Solution {
    public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        
        
        vector<vector<int>> result;
        
        if(nums.empty()) return {}; // or just return result becaus the result is initialised and is empty.
        
        sort(nums.begin(),nums.end());
        
        //Have low and high pointers and i has to iterate from an outer loop.
        
        if(nums.size()==1) return {};
        
        for(int i=0;i<nums.size()-2;i++){
            
            if(i>0 &&nums[i]==nums[i-1]) continue;
            int low=i+1; int high=nums.size()-1;
            
            while(low<high){
                
                int sum=nums[i]+nums[low]+nums[high];
                
                if(sum==0){
                    vector<int> b;
                    b.push_back(nums[i]);
                    b.push_back(nums[low]);
                    b.push_back(nums[high]);
                    result.push_back(b);
                    // sort(b.begin(),b.end()); Dont have to sort it again because already the nums vector is sorted
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low<high && nums[high]==nums[high+1]) high--;
                    
                    
                    
                }else if(sum>0){
                    high--;
                    
                }else{
                    low++;
                }    
            }   
        }
        return result;
        
        
    }    
};



// below is O(n^3) solution
// class Solution {
// public:
//     vector<vector<int>> threeSum(vector<int>& nums) {
//         if(nums.empty()) return {{0}};
        
//         vector<vector<int>> a;
//         unordered_set<vector<int>> myset;
        
        
//         for(int i=0;i<nums.size()-2;i++){
//             for(int j=i+1;j<nums.size()-1;j++){
//                 for(int k=i+2;k<nums.size();k++){
                    
//                     int sum= nums[i]+nums[j]+nums[k];
//                     if(sum==0){
                        
//                         vector<int> b;
//                         // a.push_back(vector<int> ({nums[i],nums[j],nums[k]}));
//                         b.push_back(nums[i]);
//                         b.push_back(nums[j]);
//                         b.push_back(nums[k]);
//                         sort(b.begin(),b.end());
                        
//                         if(!myset.count(b)){
//                             myset.insert(b);
//                             a.push_back(b);
//                         }
                        
                        
                        
//                     }
//                 }
//             }
//         }
             
//         return a;
        
//     }
// };

int main(){
    Solution a;
    vector<int>  nums={-2};
    //int target=5;
    vector<vector<int>> c = a.threeSum(nums);
    // for (int x : b) 
    //      cout << x << " "; 

    // cout<<endl;

    for (int i = 0; i < c.size(); i++) { 
        for (int j = 0; j < c[i].size(); j++) 
            cout << c[i][j] << " "; 
        cout << endl; 
    }




    // can either do this below for answer in true false 
    // cout.setf(std::ios::boolalpha);
    // cout <<  b << endl;

    // or

    //cout <<  boolalpha << b << endl;

}