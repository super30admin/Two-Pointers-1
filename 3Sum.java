class Solution {
    //Time O(N^2)
    //Space O(1)
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0)
        {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length ; i++)
        {
            if(i > 0 && nums[i] == nums[i-1])
            {
                continue;
            }
            int low = i+1 , high = nums.length-1;
            while(low < high)
            {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0)
                {
                    List<Integer> lis = Arrays.asList(nums[i] , nums[low] , nums[high]);
                    result.add(lis);
                    low++; high--;
                    while(low < high && nums[low] == nums[low-1]) low++;
                    while(low < high && nums[high] == nums[high+1]) high--;
                }
                else if(sum < 0)
                {
                    low++;
                }
                else
                {
                    high--;
                }
            }
        }
        return result;
    }
}