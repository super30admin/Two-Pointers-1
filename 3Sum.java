// Time Complexity : O(n2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> duplicate=new HashSet<>();
        HashMap<Integer,Integer> seen=new HashMap<>();
        Set<List<Integer>> res = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(duplicate.add(nums[i])){
                for(int j=i+1;j<nums.length;j++){
                    int compliment=-nums[i]-nums[j];
                    if(seen.containsKey(compliment) && seen.get(compliment)==i){
                        List<Integer> triplets = Arrays.asList(nums[i],nums[j],compliment);
                        Collections.sort(triplets);
                        res.add(triplets);
                    }
                    seen.put(nums[j],i);
                }
            }
        }
        return new ArrayList(res);
    }
}