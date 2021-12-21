//Time Complexity O(n)
//Space Complexity O(1)

// Problem successfully compiled on leetcode
// No Problems faced while figuring out the logic

#include<vector>
#include<iostream>
using namespace std;

class Solution {
public:
    void swap(vector<int>& nums,int a, int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }   
    
    void sortColors(vector<int>& nums) {
        int low=0;
        int mid=0;
        int high=nums.size()-1;
        
        
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==2)
            {
                swap(nums,high,mid);
                high--;
            }
            else
            {
                mid++;
            }
        }
    }
};