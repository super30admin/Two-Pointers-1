// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// taking 3 pointers a for 0,b for 1, c for 2 , fixing a and c and operating on b in way by 
// moving b based on the value swapping with a or c

class Solution {
public:
    void sortColors(vector<int>& nums) 
    {
        int a=0,b=0,c=nums.size()-1;

        while(b<=c)
        {
            if(nums[b]==2)
            {
                swap(nums[b],nums[c]);
                c--;
            }
            if(nums[b]==0)
            {
                swap(nums[a],nums[b]);
                b++;
                a++;
            }
            else
            b++;   
        }
        return;
    }
};