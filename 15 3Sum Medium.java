
/**
15. 3Sum
Time Complexity: O(n^2)
Space Complexity:O(n + nc3*log*3)
    -simple HashSet
    
    -set of list of integer: max size = nC3
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      //  List<List<Integer>> ans = new ArrayList<List<Integer>>();    
        Set<List<Integer>> result = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length;++i){
            
            int targetSum = 0 - nums[i];
            set = new HashSet<>();
                
            for (int j = 0; j < nums.length;++j){
                if(i != j){
                    
                    if(set.contains(targetSum - nums[j])){
                        //add to result;
                        List<Integer> temp = new ArrayList<Integer>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(targetSum - nums[j]);
                        Collections.sort(temp);                   
                        if(temp.size() == 3){
                            result.add(temp);
                        }
                    }
                    set.add(nums[j]);
                    
                }
            }
        }
        /*for(List<Integer> temp : result){
            ans.add(temp);
        }*/
        return new ArrayList<List<Integer>>(result); 
    }
}
