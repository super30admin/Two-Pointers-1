// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Use a pointer to run the outer for loop over the array except for last two elements and 
// use two pointers j and k starting beginning and ending respectively and check if 
// the sum of values at indices j and k equals the complemet value if yes then add
// it to list and increment and decrement j and k respectively. In order to avoid duplicates
// increment j value if number at current j equals number at j-1 and decrement k value if
// number at current k equals number at k+1. In the outer for loop to avoid duplicates ignore 
// when the same value is repeated using continue.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            if( i>0 && nums[i]==nums[i-1]) {
                continue;
            }
            int j=i+1;
            int k = nums.length-1;
            while(j<k){
                    if(nums[j]+nums[k] < -nums[i]){
                        j++;
                    }
                    else if(nums[j]+nums[k]> -nums[i]){
                        k--;
                    }
                    else{
                        List<Integer> l = new ArrayList<Integer>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        output.add(l);
                        j++;
                        k--;
                        while(j<k && nums[j]==nums[j-1]){
                            j++;
                        }
                        while(j<k && nums[k]==nums[k+1] ){
                            k--;
                        }
                    }
            }
        }
        return output;
    }
}