//Time Complexity: O(n^2)
//space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        

        //sort array to apply BS for finding 2Sum array later
        Arrays.sort(nums);
       
        
        for(int i=0; i<nums.length; i++) {
            int l = i+1;
            
            //avoid duplicates by comparing curr and prev items
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            int r = nums.length - 1;
            
            while(l<r) {
                
                //calculate 3Sum at this point
                int currSum = nums[i] + nums[l] + nums[r];
                
                if(currSum == 0) {//we have the desired solution
                    
                    //add the 3 items as array into result
                    List<Integer> temp = Arrays.asList(nums[i], nums[l],nums[r]);
                    Collections.sort(temp); //sorting to avoid duplicates --> checked later
                    result.add(temp);

                    l++;
                    r--;
                    
                    //increment l and check for duplicated on left side
                    while(l<r && nums[l] == nums[l-1]) {
                        l++;
                    }
                    
                    //increment r and check for duplicates on right side
                    while( r>l && nums[r] == nums[r+1]) {
                        r--;
                    }
                    
                    
                } else if (currSum < 0) { //sorted array, we might find the 2Sum soln on the righ
                    l++; //reduce search space to l+1, h
                } else { //else 2Sum on the left
                    r--;//reduce search space to l,h-1
                }
            }
        }
        
        return result;
    }
}