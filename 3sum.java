// Time Complexity : O(n^2) n is the length of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no



// I am taking an element and finding a pair that sums to zero along with the element. I am using HashSet to avoid duplicates



class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s = new HashSet<>();
        Arrays.sort(nums);
        for(int i =0;i<nums.length-2;i++){
            int p1= i+1;
            int p2= nums.length-1;
            while(p1<p2){
            int threesum = nums[i]+ nums[p1]+nums[p2];
            if(threesum==0){
                s.add(Arrays.asList(nums[i], nums[p1++], nums[p2--]));
            }
            else if(threesum<0){
                p1++;
            }
            else{
                p2--;
            }
        }
        }
 
        return new ArrayList<>(s);
    }
}