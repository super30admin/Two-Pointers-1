
//time complexity: O(n^2)
//space complexity:O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        if(nums==null||nums.length==0) return new ArrayList<>();
        Arrays.sort(nums);
        int n =nums.length;
        for (int i=0;i<n;i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
            {
                continue;//if the present element and the previous are same
                //we increment the low pointer
            }
            int low=i+1;int high=n-1;
            while(low<high)
            {
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0)
                {
                    List<Integer> li=Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(li);
                    low++;high--;// we execute this statement as we need multiple triplets
                    while(low<high && nums[low]==nums[low-1]) low++;//if the present element                        //and the previous are same we increment the low pointer to avoid                               //duplicacy 
                    while(low<high && nums[high]==nums[high+1]) high--;
                }
                else if(sum<0)
                {
                    low++;//Since the array is sorted and if we get the value
                    //of sum negative then we increment the low pointer else we decrement
                    //the high pointer.
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
