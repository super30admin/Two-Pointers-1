/*
Runtime complexity - O(N2) - where N is the number of elements in the input array
Space complexity - O(1) - as the output array is permitted as part of the result.  
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-2 && nums[i]<=0;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            while(left<right)
            {
                int sum=nums[left]+nums[right]+nums[i];
                if(sum==0)
                {
                    List<Integer> inter_result=new ArrayList<>();
                    inter_result=Arrays.asList(nums[i],nums[left],nums[right]);
                    set.add(inter_result);
                    left++;
                    right--;
                }
                else if(sum>0)
                    right--;
                else
                    left++;
            }
        }
        List<List<Integer>> list = new ArrayList<List<Integer>>(set);
        return list;
    }
}
