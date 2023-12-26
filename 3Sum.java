// Time Complexity : O(nlogn) + O(n ^ 2)
// Space Complexity : O(1)
// Method used : Sorting 

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList();
        int j, k, length = nums.length, sum = 0;

        for(int i = 0; i < length; i++)
        {

            if(i > 0 && nums[i] == nums[i - 1]) continue;

            j = i + 1;
            k = length - 1;

            while(j < k)
            {
                sum = nums[i] + nums[j] + nums[k];

                if(j > i + 1 && nums[j] == nums[j - 1]) j++;

                else if(sum == 0)
                {
                    List<Integer> temp = new ArrayList();
                    temp.add(nums[i]); temp.add(nums[j]); temp.add(nums[k]);
                    result.add(temp);

                    j++;
                    k--;
                }

                else if(sum < 0) j++;

                else --k;
            }
        }

        return result;
    }
}