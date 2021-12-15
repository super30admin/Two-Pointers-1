// Time Complexity :O(N^2)+O(NLOGN)->O(N^2)(higher order term)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
/*Approach: Firstly, we have to sort the given array. Here, we are fixing first variable and applying 2 pointer approach of 2sum that is equal
to the target and also we are avoiding repetitions.
 */


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0&&nums[i]==nums[i-1])
                continue;
            int low=i+1;
            int high=nums.length-1;
            if(nums[i]>0)
                return l;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0)
                {
                    List<Integer> li=Arrays.asList(nums[i],nums[low],nums[high]);
                    l.add(li);
                    low++;
                    high--;
                    while(low<high && (nums[low]==nums[low-1]))
                          low++;
                    while(low<high && (nums[high]==nums[high+1]))
                                high--;

                }
                else if(sum>0){
                    high--;
                   if(nums[high]==nums[high+1])
                    high--;
                }
                else
                {   low++;
                    if(nums[low]==nums[low-1])
                    low++;

                }
            }

        }
        return l;
    }
}