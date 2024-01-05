//TC = O(n2)
//SC = O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n-2; i++)
        {
            if(nums[i] > 0) break;
            //outside duplicacy
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int l = i + 1, r = n - 1;
            while(l < r)
            {
                int currSum = nums[i] + nums[l] + nums[r];
                if(currSum == 0)
                {
                    //got triplet
                    result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++; r--;
                    while( l < r && nums[l] == nums[l-1]) l++;
                    while( l < r && nums[r] == nums[r + 1]) r--;
                }
                else if(currSum > 0) r--;
                else l++;
            }
        }
        return result;
    }
}