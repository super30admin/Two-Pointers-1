
// Time Complexity : O(n^2logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :


//******
// Any problem you faced while coding this : Can you  please explain time complex and space Complex for the below solutions


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //Declare List of Integers List
        List<List<Integer>> result = new ArrayList<>();
        
        //return the empty ArrayList
        if(nums == null || nums.length == 0) return new ArrayList<>();
        int n = nums.length;
        
        //Sort the unsorted Array O(nlogn)
        Arrays.sort(nums);
        
        //loop till 3rd num from last
        for(int i=0; i < n-2; i++){
            
            // if
            if(i!=0 && nums[i] == nums[i-1]) continue;
            
            int low = i+1;
            int high = n-1;
            
            while(low<high){
                int sum = nums[i] + nums[low] + nums[high];
                
                if(sum == 0) {
                    //List of Integers
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    
                    // Sorted array no need to sort and add to list
                    result.add(li);  
                    
                    //Inc low pointer
                    low++; 
                    //Dec high pointer
                    high--;
                    
                    //Duplicates from left side, increase the low pointer
                    while(low<high && nums[low] == nums[low-1]) low ++;
                     //Duplicates from right side, decrease the low pointer
                    while(low<high && nums[high] == nums[high+1]) high--;
                }
                //if sum is greater thaan target, decr the high to get the target
                else if(sum > 0){
                    high--;
                }
                 //if sum is smaller thaan target, incr the low to get the target
                else{
                    low++;
                }
            }
        }
        
        return result; 
    }
}


// Time Complexity : O(n^3logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        //return the empty ArrayList
        if(nums == null || nums.length == 0) return new ArrayList<>();
        
        //Declare the HashSet for avoiding duplicates {[],[],[]}
        HashSet<List<Integer>> set = new HashSet<>();
        
        int n = nums.length;
        
        for(int i=0;i<n-2; i++){  // 3rd number from last
            for(int j=i+1;j<n-1;j++){ //2nd number from last
                for(int k=j+1;  k<n; k++){ // n
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> li = Arrays.asList(nums[i],nums[j],nums[k]);  // List of numbers
                        Collections.sort(li); //Sort the list of numbers
                        set.add(li); // add to HashSet 
                    }
                }
            }
        }
        return new ArrayList<>(set); 
    }
}