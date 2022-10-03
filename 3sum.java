//Time Complexity: O(nlogn) + O(n^2) = O(n^2).
//Space Complexity:  O(1).
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length; i++){
            int p1 = i + 1;
            int p2 = nums.length-1;
            
            if( i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            while(p1 < p2){
                int sum = nums[i] + nums[p1] + nums[p2];
                if(sum < 0){
                    p1++;
                }
                else if(sum > 0){
                    p2--;
                }
                else{
                    result.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                    p1++;
                    p2--;
                    while(p1 < p2 && nums[p1] == nums[p1 - 1]){
                        p1++;
                    }
                    
                    while(p1 < p2 && nums[p2] == nums[p2 + 1]){
                        p2--;
                    }
                }
            }
        }
        
        return result;
        
    }
}