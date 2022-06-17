class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null) return null;
        List<List<Integer>> result= new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
               for(int k=j+1;k<nums.length;k++){
                    List<Integer> temp= new ArrayList<>();
                    if(nums[i]+nums[j]+nums[k]==0){
                            temp.add(nums[i]);
                            temp.add(nums[j]); 
                            temp.add(nums[k]);
                            Collections.sort(temp);
                         if(!result.contains(temp))result.add(temp);
                        }
                        
                }
            }
        }
        
                                    return result;}}
