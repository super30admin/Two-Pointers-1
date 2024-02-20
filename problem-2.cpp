// 15. 3sum
// Time Complexity : O(n*n)
// Space Complexity :O(n*n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
    
Utilizied the two pointer approach to find all triplets sum up zero.
iterated over each element in the array, considering it as the first 
element of the triplet. Within each iteration, used two pointers, low 
and high, to find the other two elements such that their sum equals the
negative of the current element. 

*/
vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> ans;
        int low, high, target;
        int n = nums.size()-1;
        for(int i = 0; i < nums.size()-1; i++)
        {
            if(i==0 || (nums[i] != nums[i-1]))     
            {
                low = i+1, high = n, target = 0 - nums[i];
                while(low < high)
                {
                    if(nums[low] + nums[high] == target)
                    {
                        ans.push_back({nums[i], nums[low], nums[high]});

                        while(low != n && nums[low+1] == nums[low])
                            low++;
    
                        while(high != 0 && nums[high-1] == nums[high])
                            high--;

                        low++;
                        high--;

                    }
                    else if(nums[low] + nums[high] > target)
                        high--;
                    else
                        low++;
    
                }
            }
        }
        return ans;    
    }