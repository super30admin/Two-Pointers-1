class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        int len= nums.length;
        List<List<Integer>> result = new ArrayList();  
        Set<List<Integer>> res = new HashSet();
        
        
        for(int i=0; i<len; i++) {
            for(int j=i+1; j<len; j++) {
                int k = -(nums[i]+nums[j]);
                
                int foundIndex = Arrays.binarySearch(nums, j+1, len, k);
                
                if(foundIndex >=0) {
                    List<Integer> triplets= Arrays.asList(nums[i], nums[j], nums[foundIndex]);
                    res.add(triplets); 
                }
                
            }

        }
        // System.out.println(res);
        for(List<Integer> l : res) {
            result.add(l);
        }
        return result;
    }
}
