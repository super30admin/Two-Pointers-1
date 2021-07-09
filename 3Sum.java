// time - n ^ 2
// space - n

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();


        for(int i=0 ; i<nums.length-1 ; i++)
        {
            for(int j=i+1 ; j<nums.length ; j++)
            {
                int target = 0 - nums[i] - nums[j];

                if(map.containsKey(target) && map.get(target) == i)
                {
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(target);
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    Collections.sort(triplet);
                    if(!ans.contains(triplet)) ans.add(triplet);
                }

                map.put(nums[j],i);

            }

        }

        return ans;

    }
}
