Time Complexity-O(n)
Space Complexity-O(1)
Did the code run on Leetcode? yes

#include <iostream>
#include<vector>
using namespace std;

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int count0=0,count2=0;
        if(nums.size()==0)
        {
            return;
        }
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]==0)
            {
                if(count0<nums.size() && i!=count0)
                {
                    swap(nums[i--],nums[count0]);
                }
                count0++;
            }
            if(nums[i]==2)
            {
                if(count2<nums.size() && i<nums.size()-count2-1)
                {
                    swap(nums[i--],nums[nums.size()-count2-1]);
                }
                count2++;
            }
        }
        for(int i=0;i<nums.size();i++)
        {
            cout<<nums[i]<<" ";
        }
    }
};

int main() {
	vector<int>m={2,0,2,1,1,0};
	Solution soln;
	soln.sortColors(m);
	return 0;
}