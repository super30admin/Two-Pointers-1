//Time comlpexity - O(n)
//Space complexity - O(1)
//Ran successfully on leetcode
//3 point approach is the following -
//1.We assign 3 pointers i.e. one for 0, one for 1, and one for 2
//2.We compare low and high based on the middle pointer.
//3.If middle is 2, we swap it with the high pointer to push it to the end. Similarly, if we see 0 as mid, then we swap with low pointer. Else if its equal to 1, we just move the mid pointer one place ahead.

class Solution {
public:
    void sortColors(vector<int>& nums) {
        if(nums.size()==0)
            return;
        int l=0,h=nums.size()-1,m=0;
        while(m<=h)
        {
            if(nums[m]==2)
            {
                swap(nums[m],nums[h]);
                    h--;
            }
            else if(nums[m]==0)
            {
                swap(nums[m],nums[l]);
                l++;
                m++;
            }
            else
                m++;
        }
    }
};