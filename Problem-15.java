/*

Time Complexity: O(n3)

Leetcode: Time limit Exceeded:
311 / 313 test cases passed.


Approach:

try all the combinations for each element.

*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> ala = new ArrayList<List<Integer>>();
        ArrayList<Integer> al = new ArrayList<Integer>();
        HashSet<List<Integer>> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(j==i) continue;
                for(int k=j+1;k<nums.length;k++)
                {
                    if(k==i || k==j) continue;
                    
                    if((nums[i]+nums[j]+nums[k])==0)
                    {
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[k]);
                        Collections.sort(al);
                        if(!hs.contains(al))
                        {
                          ala.add(al);
                          hs.add(al);
                        } 
                        al = new ArrayList<Integer>();
                    }
                }
            }
        }
        
        return ala;
        
        
    }
}
