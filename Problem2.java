// Time Complexity : O(n^2)
// Space Complexity : O(1)
    // n & m are the number of rows and columns of the given array

// Your code here along with comments explaining your approach
    //We first sort the array. There will be a first pointer pointing at every index. The remaining 2 pointers will be using "Two-Pointers" approach at every first pointer.
    //The first pointer(i) traverses from left to right. At every i, we will initialize low and high as "i+1" and "n-1" where n is length of array. We then calculate the collective sum of nums[i]+nums[low]+nums[high].
    //If the sum is zero we save it, if it is less than zero, we move the low pointer to right or the high pointer to left. In this way we will go through the entire array.

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> tripletSet = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for (int i=0; i<n; i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int requiredSum = -1*(nums[i]);
            int low = i+1;
            int high = n-1;
            while(low<high)
            {
                int sum = nums[low]+nums[high];
                if (requiredSum==sum)
                {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[low]);
                    triplet.add(nums[high]);
                    Collections.sort(triplet);
                    tripletSet.add(triplet);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1])
                    {
                        low++;
                    }
                    while(low<high && nums[high]==nums[high+1])
                    {
                        high--;
                    }
                }
                else if (sum<requiredSum)
                {
                    low++;
                }
                else
                {
                    high--;
                }
            }
        }
        return new ArrayList<>(tripletSet);
    }
}