//time complexity:O(n)
//space complexity:O(1)
//executed on leetcode: yes
//approach:brute force
//any issues faced? yes, tried the 2 pointer approach but 
//didnt get the answer.
//brute force
class Solution {
public:
    void sortColors(vector<int>& nums) {
        int zero=0;
        int one=0;
        int two=0;
        for(int i=0; i<nums.size(); i++)
        {
            if(nums[i]==0)
                zero++;
            else if(nums[i]==1)
                one++;
            else if(nums[i]==2)
                two++;
        }
        for(int i=0;i<nums.size();i++)
        {
            while(zero--)
            {
                nums[i]=0;
                i++;
            }    
            while(one--)
            {
                nums[i]=1;
                i++;
            }
            while(two--)
            {
                nums[i]=2;
                i++;
            }
        }
    }
};