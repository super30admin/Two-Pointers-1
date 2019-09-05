Problem-2
---------
// Time Complexity :  O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            j=i+1;
            k=nums.length-1;
            if(i!=0 && nums[i]==nums[i-1]) continue;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }
                if(sum==0){
                        List<Integer> li=new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        l.add(li);    
                    j++;
                    while(nums[j]==nums[j-1] && j<k){
                        j++;
                    }
                }
                if(sum>0){
                    k--;
                }
            }
        }
        return l;
    }
    
}

Problem-3
---------
// Time Complexity :  O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
            int area = (j-i)*(Math.min(height[i],height[j]));
            max = Math.max(max,area);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }
}
