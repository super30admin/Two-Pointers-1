// Time Complexity : O(n*n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList();

        int n = nums.length;

        Arrays.sort(nums);

        //iterate over outer elements
        for(int i = 0; i < n-2; i++)
        {
            //outer duplicacy check
            //we have already checked for triplets with this outer element
            if(i != 0 && nums[i] == nums[i-1])
                continue;

            //run two pointers for current outer element
            int left = i+1;
            int right = n-1;

            while(left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0)
                {
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(list);
                    left++;
                    right--;

                    //inner duplicacy checks
                    while(left < right && nums[left] == nums[left-1])
                        left++;
                    while(left < right && nums[right] == nums[right+1])
                        right--;

                }
                else if(sum > 0)
                    right--;
                else
                    left++;
            }
        }
        return result;
    }
}
