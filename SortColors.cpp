#include<iostream>
#include<vector>
using namespace std;

// Time Complexity : O(N)
// Space Complexity : 1
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :I have written swap function in Java which seems not swapping the values  
// So I switch to C++ and it is working on leetcode



// Your code here along with comments explaining your approach
/* We will be using Two Pointer approach to sort the colors.This approach is somehow similar to binary search approach 
*/
void sortColors(vector<int>& nums) {
    int size = nums.size(); 
    int low = 0,mid = 0,high = size -1;
    while(mid <= high){
        switch (nums[mid])
        {
        case  0: 
            swap(nums[low++],nums[mid++]);
            break;
        case 1 : mid++;
            break;
        case 2: 
            swap(nums[mid],nums[high--]);
            break;
        }
    }      
}

int main(){
    vector<int> nums;
    nums.push_back(0);
    nums.push_back(1);
    nums.push_back(1);
    nums.push_back(2);
    nums.push_back(1);
    nums.push_back(0);
    nums.push_back(2);
    nums.push_back(0);
    sortColors(nums);
    for(int i =0; i < nums.size(); i ++){
        cout<<nums[i] <<"\t";
    }
    return 0;
}