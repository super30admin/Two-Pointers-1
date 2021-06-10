/*Approach -1 
 * TC - O (N^3) - O (N^2)  - outer nested iterations + one nested interation to check if the result array already exists 
 *SC - O(N) Auxiliary array used 
 Ran on Leetcode - TLE 
 * */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans  = new ArrayList<>();
        
        
        for (int i  = 0 ; i < nums.length-2; i++){
            
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1; 
            int k = nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0 ){
			// bew arraylist to add into resultant answer
                    List<Integer> anotherList = Arrays.asList(nums[i], nums[j], nums[k]);
                    List<Integer> resultInter = new ArrayList<>();
                    resultInter.addAll(anotherList);
		    // check if the tripler alreeady exists
                    if (!ans.contains(resultInter)){
                        ans.add(resultInter);
                    }
                    // move pointers
                    j += 1;
                    k -= 1;

                } else if (sum > 0){
			// move right pointer since the  sum exceeds the target
                    k -= 1;
                } else {
			// move left since the sum is negative, we need greater numners which can be found to the right
                    j += 1;
                }
                
            }
            
            
            
        }
        
        return ans;
        
    }
}


/*Approach 2 
 *
 * TC - O (N^2)  -  nested iterations 
 * SC - O(N) - hashset auxiliary data strcture used 
 * Ran on leetcode -yes
 * */


iclass Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort to apply the two pointer approach for reducing and incremennting the left and right pointers based on the sum.
        Arrays.sort(nums);
        // creating a set since we dont want duplicate values 
        Set<List<Integer>> ans  = new HashSet<>();
       
        for (int i  = 0 ; i < nums.length-2; i++){
            // to check if there are duplicates, if yes, skip
            if (i> 0 && nums[i] == nums[i-1]){
                continue;
            }
            //Two pointer approach 
            int j = i+1; 
            int k = nums.length-1;
            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0 ){
                    // found the triplet
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j += 1;
                    k -= 1;
                } else if (sum > 0){
                    k -= 1;
                } else {
                    j += 1;
                }   
            }     
            
        }
        return new ArrayList<>(ans);
    }
}

