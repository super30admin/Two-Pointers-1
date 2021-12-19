// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<Integer> sol = new ArrayList<>();
        List<List<Integer>> f_sol = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int ptr1 = i+1;
            int ptr2 = nums.length - 1;
            while(ptr1 < ptr2)
            {
                if((nums[i] + nums[ptr1] + nums[ptr2]) == 0)
                {
                    f_sol.add(Arrays.asList(nums[i],nums[ptr1],nums[ptr2]));
                    while(ptr1<ptr2 && nums[ptr1] == nums[ptr1+1]) {
                        ptr1++;
                    }
                    while(ptr1<ptr2 && nums[ptr2] == nums[ptr2-1]) {
                        ptr2--;
                    }
                    ptr1++;
                    ptr2--;
                }
                else if((nums[i] + nums[ptr1] + nums[ptr2]) > 0)
                {
                    ptr2--;
                }
                else
                {
                    ptr1++;
                }
            }
            while(i<(nums.length-2) && nums[i] == nums[i+1]) {
                i++;
            }
        }
        
        return new ArrayList<>(f_sol);
    }
}