// Time Complexity :O(n2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/*
we can implement by selecting a pivot element and sum other two elements which would bring total sum to 0
the other two elements can be identified wither by 
1. two sum problem - this will need a additional hashset of triplets to avoid duplicate triplets 
time - O(n2) 
space - O(n)
2. binary search
time - O(n2logn)
3.we can use two pointers 
time- O(n2)
space - O(1)
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result= new ArrayList<>();
        Arrays.sort(nums);// sort because we want to implement two pointer
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0) break;//we dont want to iterate if one element all the elements after this is >0 because sum is >0
            if(i>0 && nums[i]==nums[i-1]) continue;//remove external duplicate triplets
            int l=i+1;
            int r=nums.length-1;
            //two pointer for remaining elements after the pivot
            while(l<r){
                if(nums[l]+nums[r]+nums[i]==0){
                    List<Integer> li= Arrays.asList(nums[l],nums[r],nums[i]);
                    result.add(li);
                    l++;
                    r--;
                    //remove interval duplicate elements
                    while(l<r && nums[l]==nums[l-1]) l++;
                    while(l<r && nums[r]==nums[r+1]) r--;
                }
                else if(nums[l]+nums[r]+nums[i]<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return result;
    }
}