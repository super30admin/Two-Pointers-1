//Time Complexity-O(n^2)
//Space-O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>output=new ArrayList();
        if(nums==null||nums.length==0)
        {
            return output;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(i!=0&&nums[i-1]==nums[i])//For duplicates becuase it will give same answer
            {
                continue;
            }
            int low=i+1;
            int high=nums.length-1;
            while(low<high)
            {
                int curSum=nums[i]+nums[low]+nums[high];
                if(curSum==0)
                {
                    output.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low=low+1;
                    high=high-1;
                    while(low<high&&nums[low]==nums[low-1])
                    {
                        low++;
                    }
                    while(low<high&&nums[high]==nums[high+1])
                    {
                        high--;;
                    }
                }
                else if(curSum<0)
                {
                    low=low+1;
                    while(low<high&&nums[low]==nums[low-1])
                    {
                        low++;
                    }
                }
                else{
                    high=high-1;
                    while(low<high&&nums[high]==nums[high+1])
                    {
                        high--;;
                    }
                }
            }
        }
        return output;
    }
}