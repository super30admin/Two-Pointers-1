// Time Complexity : O(n^2)+O(n log(n)) first sorted the given array (nlog(n)) and later for each iteration checked 2 pointers inside while loop
// Space Complexity : O(1) no auxilary data structure used for processing
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : added check of conditions in first while loops directly later again

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        //null check
        if( nums.length < 3 || nums == null ) return new ArrayList<List<Integer>>();
        
        Arrays.sort(nums); //sorting given array
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for( int i = 0; i < nums.length-2; i++ ) {//running first pointer till len-2
            if(i > 0 && nums[i] == nums[i-1]) {
                //if the numbers are equal, can't take duplicates
                continue;
            }
            int low = i+1; //dealt with 0th element so +1
            int high = nums.length - 1; //;last element is highest after sorting
            
            while(low < high) {
                //outer loop is dealing with each num, inner loop for comparing sum
                int sum = nums[i] + nums[low] + nums[high];
                
                if(sum == 0) { //if sum is given ideal sum (0)
                    List<Integer> li =Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li); //prepared a list of nums and added to result
                    //low and high used, so moving ahead in opposite direction
                    low++;
                    high--;
                    
                    //checkinng the conditions in while again, because manipulated
                    while( low < high && nums[low] == nums[low-1] ) low++;
                    while( low < high && nums[high] == nums[high+1] ) high--;
                    
                }
                else if(sum < 0) {
                    low++;
                }
                else {
                    high--;
                }
            }
            
        }
        return result;
    }
}