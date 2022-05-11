// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> result  = new HashSet<>();//so we dont store duplicate lists
        if(nums.length==0){
            return new ArrayList<>(result);
        }
        Arrays.sort(nums);
        for(int low=0; low<nums.length-2;low++){
            int mid = low+1;
            int high = nums.length-1;
            while(mid<high){
                int sum = nums[low]+nums[mid]+nums[high];
                if(sum==0){//if sum of 3 pointers is 0 add them to List
                    result.add(Arrays.asList(nums[low],nums[mid++],nums[high--]));
                }
                else if(sum>0){//since its sorted greater sum means reduce higher pointer
                    high--;
                }
                else{
                    mid++;//or move mid pointer
                }
            }
        }
        return new ArrayList<>(result);
    }
}