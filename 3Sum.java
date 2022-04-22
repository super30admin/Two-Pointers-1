//Time Complexity : O(n^2)
//Space Complexity : O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //base case
        if(nums==null||nums.length==0)
            return new ArrayList<>();
        //initialize an array for output
        List<List<Integer>> output=new ArrayList<>();
        //sort the given array
        Arrays.sort(nums);
        //iterate over the elements
        for(int i=0;i<nums.length;i++){
            //to avoid duplicates
            if(i>0 && nums[i]==nums[i-1])
                continue;
            //left is the 2 element in the array
            //right element is the last element in the array
            int l=i+1, r=nums.length-1;
            while(l<r){
                //find the sum of 3 elements, 1st,left and right
                int total=nums[i]+nums[l]+nums[r];
                //check if sum is 0 or not
                if(total==0){
                    //collect those elements as list
                    List<Integer> collection=Arrays.asList(nums[i], nums[l], nums[r]);
                    //add them to the output list
                    output.add(collection);
                    //when sum=0, move left and right then iterate
                    l++;
                    r--;
                    //check if this collection already exists, i.e., if already visited the element
                    while(nums[l]==nums[l-1] && l<r){
                        l++;
                    }
                    while(nums[r]==nums[r+1] && l<r){
                        r--;
                    }
                }
                else if(total<0){
                    //move the index of left and iterate again
                    l++;
                }
                else{
                    //if sum > 0, move right index to left
                    r--;
                }
            }
        }
        return output;
    }
}