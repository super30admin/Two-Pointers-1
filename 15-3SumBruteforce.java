class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        HashSet<List<Integer>> set = new HashSet<>();
        
        for(int i = 0; i < nums.length - 2; i++){
            
            for(int j = i+1; j < nums.length - 1; j++){
                
                for(int k = j+1; k < nums.length; k++){
                    
                    if(nums[i] + nums[j] + nums[k] == 0){
                        
                        List<Integer> l = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(l);
                        set.add(l);
                    } 
                }
            }
        }
        
        return new ArrayList<>(set);
    }
}