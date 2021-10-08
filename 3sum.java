//Time Complexity : O(N^2);
//Space Complexity : O(N) if output is considered in our code
//                   O(1) if output is not considered in our code



class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            int p=i+1,q=n-1;
            while(p<q)
            {
                if(nums[p]+nums[q]==-nums[i])
                { //System.out.println(p+" "+q);
                    List<Integer> t=new ArrayList<Integer>();
                    t.add(nums[i]);
                    t.add(nums[p]);
                    t.add(nums[q]);

                    ans.add(t);

                    while(p+1<q &&  nums[p+1]==nums[p]) p++;
                    while(q-1>p &&  nums[q-1]==nums[q]) q--;

                    p++; q--;
                }
                else if(nums[p]+nums[q] < -nums[i]) p++;
                else q--;
            }

            while(i+1<n && nums[i+1]==nums[i]) i++;
        }
        return ans;
    }
}