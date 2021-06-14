// Time Complexity: O(n^2)
// Space Complexity: O(n) for sorting
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        if(nums==null || nums.length<3)
            return res;
        int n=nums.length;
        int pivot=0, lt=0, rt=n-1, sum=0;
        // Java 8 does quick sort. Time complexity O(nlong). Space Complexity for sort is O(n)
        Arrays.sort(nums);
        
        // Time complexity is O(n^2) Since we are iterating all the nums to the right of pivot for each and every pivot-index.
        for(int i=0;i<n; i++)
        {
            while(i>0 && nums[i-1]==nums[i])
                i++;
            pivot=nums[i];
            lt=i+1;
            rt=n-1;
            while(lt<rt && rt <n)
            {
                sum=pivot+ nums[lt]+nums[rt];
                
                if(sum==0)
                {
                    List<Integer> list=Arrays.asList(nums[i],nums[lt],nums[rt]);
                    res.add(list);
                    lt++;rt--;
                    while(nums[lt]==nums[lt-1])
                    {
                        lt++;
                    }
                    while(nums[rt]==nums[rt-1])
                    {
                        rt++;
                    }
                    if(lt>=rt)
                    {
                        rt=lt+1;
                    }
                }
                else if(sum< 0)
                {
                    lt++;
                    // Since we need 3 distint elements pivot-index, lt and rt should be different
                    if(lt==rt)
                        rt++;
                }
                else
                {
                    rt--;
                }
            }
            
        }
        
        return res;
        
    }
}