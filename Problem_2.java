// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach



class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        // remove duplicates from result
        Set<List<Integer>> hs = new HashSet<>();
        
        // edge case
        if(nums.length==0 || nums == null ) return result;
        
        int k = nums.length-1; int j = k-1;
        
        // sort the array
    
        Arrays.sort(nums);
        
        // start i from 0, let j be last but one , and k be last element
        for(int i=0;i<nums.length-2;i++){
            
            j = i+1;
            k = nums.length-1;
            
            // use j and k as two pointers
            while(j<k){
                
                // sum > 0 decrement k
                if(nums[i]+nums[j]+nums[k] > 0 ){
                    k--;
                    // sum ==0, sort elemenst, add it to list to remove duplicates
                }else if(nums[i]+nums[j]+nums[k]==0){

                    List<Integer> ls = Arrays.asList(nums[i],nums[j],nums[k]);
                    Collections.sort(ls);
                    hs.add(ls);
                    j++;k--;
                }else{
                    
                    // sum < 0 increment j
                    j++;
                }
            }
        }
        
        return new ArrayList<>(hs);
    }
                           
         
}