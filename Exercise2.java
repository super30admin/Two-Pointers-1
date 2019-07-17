class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=1;j<nums.length-1;j++)
            {
                for(int k=2;k<nums.length;k++)
                {
                    if(nums[i]+nums[j]+nums[k]==0 && i!=j && j!=k && i!=k){
                        List<Integer> temp= new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                        Collections.sort(temp);
                        if(!result.contains(temp))result.add(temp);
                    }
                }
            }
        }
        return result;
    }
}