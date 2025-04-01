// Time Complexity : O(N) N is size of array
// Space Complexity : O(N)  
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach:
// 1. Keep 3 pointers representing 0,1,2 and start 0,1 from 0-index and 2 from last.
// 2. compare all 3 elements pointing and sort accordingly.

class Solution {
public:
    void swap(int &a,int &b){
        int t=a;
        a=b;b=t;
    }
    void sortColors(vector<int>& nums) {
        //sort(nums.begin(),nums.end());
        int a=0,b=0,c=nums.size()-1;
        while(b<=c){
            if(nums[b]==2){
                swap(nums[b],nums[c]);c--;
            }
            else if(nums[b]==0){
                swap(nums[b],nums[a]);a++;b++;
            }else{
                b++;
            }
            cout<<a<<' '<<b<<' '<<c<<'\n';
        }
    }
};

