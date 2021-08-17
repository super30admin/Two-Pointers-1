//Time complexity: O(n^2), where n is the number of elements in the array nums
//Space complexity: O(1)
//running on leetcode: yes
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums==null || nums.length==0)
        {
            return new ArrayList<>();
        }
        int n = nums.length;
        //resultant array is list of lists
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        //traverse the array
        for (int i=0; i<n; i++)
        {
            //out of bounds index
            if (i!=0 && nums[i]==nums[i-1]) continue;
            //low pointer is always 1 higher than i, and pivot is nums[i]
            int low=i+1, high=n-1;
            while(low<high)
            {
                //sum = pivot+low+high
                int sum=nums[i]+nums[low]+nums[high];
                if (sum == 0)
                {
                    //create a list of the numbers pivot, low and high, and add it to result
                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    while (low<high && nums[low]==nums[low-1])
                    {
                        low++;
                    }
                    while (low<high && nums[high]==nums[high+1])
                    {
                        high--;
                    }
                }
                else if (sum<0)
                {
                    low++;//looking for larger number
                }
                else //sum>0
                {
                    high--;//looking for smaller number
                }
            }
        }
        return result;
    }
}
