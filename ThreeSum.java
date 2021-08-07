/* Time Complexity : O(n^2) 
   Space Complexity :  O(1) 
   Did this code successfully run on Leetcode : Yes
   Any problem you faced while coding this : No
*/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(nums); //sort the array
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1,k=nums.length-1; // two pointers
            if(i!=0 && nums[i]==nums[i-1]) continue; //if same numbers, move it till the last repeated number
            if(nums[i]>0) break; //if number is greater than 0, no point in checking. so exit out of loop
            while(j<k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum==0)//sum=0, then add the pair to the list
                {
                    List<Integer> li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(nums[k]);
                    res.add(li);
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++; //move the pointers if adjacent elements are same
                    while(j<k && nums[k]==nums[k+1]) k--; 
                }
                else if(sum>0)
                {
                   k--; 
                }
                else
                {
                    j++;
                }
            }
        }
        return res;
    }
}