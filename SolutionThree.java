// Time Complexity :O(n2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :nopes

class SolutionThree {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result=new ArrayList<>();

        if(nums==null||nums.length==0)
            return result;

        int n=nums.length;

        List<Integer> li=new ArrayList<Integer>();

        Arrays.sort(nums);

        for(int i=0;i<n-2;i++)
        {
            int low=i+1;
            int high=n-1;

            if(i>0&&nums[i]==nums[i-1])
                continue;

            while(low<high)
            {
                int sum=nums[i]+nums[low]+nums[high];

                if(i>0&&nums[i]==nums[i-1])
                    continue;

                if(sum==0)
                {
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    while(low<high&&nums[low]==nums[low-1])
                        low++;

                    while(low<high&&nums[high]==nums[high+1])
                        high--;
                }
                else if(sum<0)
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