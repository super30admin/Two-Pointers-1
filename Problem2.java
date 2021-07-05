// Time Complexity : O(n3)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : No, time limit exceeded
// Approach: Find all possible pairs and add the pairs that sums to zero in the list.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3){
            return result;
        }
        else if(nums.length == 3){
            if(nums[0]+nums[1]+nums[2]==0){
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(nums[0]);
                temp.add(nums[1]);
                temp.add(nums[2]);
                result.add(new ArrayList(temp));
                return result;                
            }
        }
        else{
            for(int i = 0; i<nums.length-2; i++){
                for(int j = i+1; j<nums.length-1; j++){
                    for(int k = j+1; k<nums.length; k++){
                        if(nums[i]+nums[j]+nums[k]==0){
                            List<Integer> temp = new ArrayList<Integer>();
                            if(nums[i]<=nums[j] && nums[i]<=nums[k]){
                                temp.add(nums[i]);
                                if(nums[j]<=nums[k]){
                                    temp.add(nums[j]);
                                    temp.add(nums[k]);
                                }
                                else{
                                    temp.add(nums[k]);
                                    temp.add(nums[j]);
                                }
                            }
                            else if(nums[j]<=nums[i] && nums[j]<=nums[k]){
                                temp.add(nums[j]);
                                if(nums[i]<=nums[k]){
                                    temp.add(nums[i]);
                                    temp.add(nums[k]);
                                }
                                else{
                                    temp.add(nums[k]);
                                    temp.add(nums[i]);
                                }
                            }
                            else if(nums[k]<=nums[j] && nums[k]<=nums[i]){
                                temp.add(nums[k]);
                                if(nums[j]<=nums[i]){
                                    temp.add(nums[j]);
                                    temp.add(nums[i]);
                                }
                                else{
                                    temp.add(nums[i]);
                                    temp.add(nums[j]);
                                }
                            }                                                    
                            if(!result.contains(new ArrayList(temp))){
                            result.add(new ArrayList(temp));
                            }
                        }
                    }
                }
            }
        }
        return result;
        
    }
}