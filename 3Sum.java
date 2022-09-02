//TC: O(n^2)
//SC: O(n)
//Program ran on leetcode
class 3Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < nums.length; i++){
            HashSet<Integer> s = new HashSet<Integer>();
            int rem = 0 - nums[i];
            for (int j = i + 1; j < nums.length; j++)
            {
                if (s.contains(rem - nums[j]))
                {
                    List<Integer> temp =new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(rem - nums[j]);
                    Collections.sort(temp);
                    if (!triplets.contains(temp)){
                        triplets.add(temp);
                    }
                }
                s.add(nums[j]);
            }
        }
        return triplets;
        }
}