/*

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
not to increment the mid pointer along with the high pointer because
it will fail for [2,0,1] case 
so increment mid only with low pointer


// Your code here along with comments explaining your approach
take low pointer to store the 0 value
take mid pointer for value 1
take high pointer to store the 2 value

*/




#include<iostream>
#include<vector>

using namespace std;

class Solution {
    void swap(int& a,int & b){
        int temp = a;
        a=b;
        b=temp;
    }
public:
    void sortColors(vector<int>& nums) {

    int n = nums.size();
    int l{},m{},h{n-1};
    while(m<=h){
        if(nums.at(m)==0){
            swap(nums.at(l),nums.at(m));
            l++;
            m++;
        }
        else if(nums.at(m)==2){
            swap(nums.at(m),nums.at(h));
            h--;
        }
        else{
            ++m;
        }
    }   
    
    }
};