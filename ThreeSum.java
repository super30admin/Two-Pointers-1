//TC : O(n^2) SC : O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
            if(i>0&&nums[i] == nums[i-1])
                continue;
            int left = i+1;
            int right = nums.length-1;

            while(left < right)
            {
                int sum = nums[i] + nums[left]+ nums[right];

                if(sum == 0)
                {
                    List<Integer> l = Arrays.asList(nums[i] ,nums[left],nums[right]);
                    result.add(l);

                    left++;
                    right--;
                    while(nums[left-1] == nums[left] && left < right)
                        left++;
                    while(nums[right+1] == nums[right] && left < right)
                        right--;
                }
                else if(sum < 0)
                    left++;
                else
                    right--;
            }
        }
        return result;
    }
}