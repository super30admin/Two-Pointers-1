//given the array
// [-1,0,1,2,-1,-4]
// we need to find all the triplets that sums to 0
// [-1,0,1],[-1,-1,2]

// so to solve this problem we have multiple approach the first brute force would be to iterate
// over all the combinations and storing the pairs in the array with sum 0

//but the time complexity for that approach would be O(N^3)

// other approach is we can iterate through each int starting from 
// but before that we will need to sort this array
// [-4,-1,-1,0,1,2]
// [-4] we place two pointers on -1 and 2 now in between this two we need to find 0-(-4) = 4

// if the some -1+ 2 = 1 < 4 low++
// else high --
// if we found the pair  high --, low++
// // we also need to check if pointers are not pointing to same values so we can avoid duplicates


// first we write the function to 

class Solution {

public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        // we need three pointer
        vector<vector<int>>result;

        // also we need to sort the nums
        sort(nums.begin(),nums.end());

        // to iterate through each int
        for(int i = 0; i <nums.size();i++)
        {
            if(i >0 && nums[i] == nums[i-1])
                continue;

            // for each int we need two pointers
            int low = i+1;
            int high = nums.size()-1;
            int target = 0 - (nums[i]);
            
            while(low < high)
            {
                // find the sum
                int sum = nums[low] + nums[high];

                if(sum < target)
                    low++;
                else if(sum >target)
                    high--;
                else
                {
                    result.push_back({nums[i],nums[low++],nums[high--]});
                    while(low < high && nums[low] == nums[low-1]) ++low;
                }

            }
        }

        return result;
    }
};

// time complexity for this is O(nlogn + O(n2))
//space complexity O(1)
